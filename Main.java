//import packages used
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

//Main Class
public class Main 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		//create new objects for CalculateTotalIncome PrintAllProperties CalculateVehicleTotalIncome cv1
		CalculateTotalIncome c1 = new CalculateTotalIncome();
		PrintAllProperties p1 = new PrintAllProperties();
		PrintAllVehicles v1 = new PrintAllVehicles();
		CalculateVehicleTotalIncome cv1 = new CalculateVehicleTotalIncome();

		//declare the ArrayList for apartment, house, villa, car and truck to store the values
		ArrayList <Apartment> apartment = new ArrayList<Apartment>();
		ArrayList <House> house = new ArrayList<House>();
		ArrayList <Villa> villa = new ArrayList<Villa>();
		ArrayList <Car> car = new ArrayList<Car>();
		ArrayList <Truck> truck = new ArrayList<Truck>();

		//Create JFrame and set dimensions
		JFrame frame_parent = new JFrame("MyBnB");
		frame_parent.setLayout(new GridLayout(4, 3));
		frame_parent.setSize(700, 700);

		//set Buttons and label "fill property" and add Action Listeners
		JButton button1 = new JButton("Fill Property");
		button1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				FillInProperties(apartment, house, villa);
			}
		});

		//set Buttons and label "view property" and add Action Listeners
		JButton button2 = new JButton("View Property");
		button2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try {
					p1.PAP(apartment, house, villa);
					v1.PAV(car, truck);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		//set Buttons and label "view total income" and add Action Listeners
		JLabel label = new JLabel();
		JButton button3 = new JButton("View Total Income");
		button3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//get value calculated from CalculateTotalIncome
				label.setText("The Total Income for this Year is: €"+ c1.CalculateTotallIncome(apartment,house,villa));
			}
		});

		//set Buttons and label "view total vehicle income" and add Action Listeners
		//JLabel label4 = new JLabel();
		JButton button4 = new JButton("View Total Vehicle Income");
		button4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//get value calculated from CalculateTotalIncome
				label.setText("The Total Vehicle Income for this Year is: €"+ cv1.CalculateVehicleTotalIncome(car,truck));
			}
		});

		//add the buttons and show Frame
		frame_parent.getContentPane().add(button1);
		frame_parent.getContentPane().add(button2);
		frame_parent.getContentPane().add(button3);
		frame_parent.getContentPane().add(button4);
		frame_parent.getContentPane().add(label);
		frame_parent.setVisible(true);
		frame_parent.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	//FillInProperties calls GiveRentalProperty to display GUI
	public static void FillInProperties(ArrayList<Apartment> apartment,ArrayList<House> house, ArrayList<Villa> villa )
	{
		GiveRentalProperty(apartment,house,villa);
	}

	public static void ReadInputPropertyFile(ArrayList<Apartment> apartment, ArrayList<House> house, ArrayList<Villa> villa) throws FileNotFoundException  
	{
		FileReader readMyFile = new FileReader("InputProperty.txt");
		Scanner in = new Scanner(readMyFile);

		while(in.hasNextLine())
		{ // this loop will run till there is a next line , means there is a ​next property in the file       ​
			String line = in.nextLine();      // here we are reading the entire line to  a String line​
			Scanner sc = new Scanner(line);// here we again create an object of scanner with line variable , this  scanner will read word by word  ​

			int PropertyType = Integer.parseInt(sc.next());
			System.out.println(line);

			//if property type is equal to 1 then use apartment array list to add into writing the file
			if (PropertyType == 1)
			{
				String name = sc.next();
				String PostalAddress = sc.next();
				int RentalCost = Integer.parseInt(sc.next());
				int TotalRentalDays = Integer.parseInt(sc.next());
				int StoryNum = Integer.parseInt(sc.next());
				int BedNum = Integer.parseInt(sc.next());

				apartment.add (new Apartment(name, PostalAddress, RentalCost, TotalRentalDays, StoryNum, BedNum));
			}

			//if property type is equal to 2 then use house array list to add into writing the file
			else if (PropertyType == 2)
			{
				String name = sc.next();
				String PostalAddress = sc.next();
				int RentalCost = sc.nextInt();
				int TotalRentalDays = sc.nextInt();
				int TotalNumberOfStorys = sc.nextInt();
				int ClearingFees = sc.nextInt();

				house.add (new House(name, PostalAddress, RentalCost, TotalRentalDays, TotalNumberOfStorys, ClearingFees));
			}

			//if property type is equal to 3 then use villa array list to add into writing the file
			else if (PropertyType == 3)
			{
				String name = sc.next();
				String PostalAddress = sc.next();
				int RentalCost = sc.nextInt();
				int TotalRentalDays = sc.nextInt();
				int ServiceCost = sc.nextInt();
				int LuxuryTax = sc.nextInt();
				int NumberOfRooms = sc.nextInt();

				villa.add (new Villa(name, PostalAddress, RentalCost, TotalRentalDays, ServiceCost, LuxuryTax, NumberOfRooms));

			}
		}
	}	
	public static void ReadInputVehicleFile(ArrayList<Car> car, ArrayList<Truck> truck) throws FileNotFoundException 
	{
		FileReader readMyFile = new FileReader("InputVehicle.txt");
		Scanner in = new Scanner(readMyFile);

		while(in.hasNextLine())
		{ // this loop will run till there is a next line , means there is a ​next property in the file       ​
			String line = in.nextLine();      // here we are reading the entire line to  a String line​
			Scanner sc = new Scanner(line);// here we again create an object of scanner with line variable , this  scanner will read word by word  ​

			int VehicleType = Integer.parseInt(sc.next());
			System.out.println(line);

			//if vehicle type is equal to 1 then use car array list to add into writing the file
			if (VehicleType == 1)
			{
				String vOwner = sc.next();
				int vTotalRentalDays = Integer.parseInt(sc.next());
				int vTotalCost = Integer.parseInt(sc.next());
				int PasNum = Integer.parseInt(sc.next());

				car.add (new Car(vOwner, vTotalRentalDays, vTotalCost, PasNum));
			}

			//if property type is equal to 2 then use truck array list to add into writing the file
			else if (VehicleType == 2)
			{
				String vOwner = sc.next();
				int vTotalRentalDays = Integer.parseInt(sc.next());
				int vTotalCost = Integer.parseInt(sc.next());
				int CargoWeight = Integer.parseInt(sc.next());

				truck.add (new Truck(vOwner, vTotalRentalDays, vTotalCost, CargoWeight));
			}
		}
	}	

	public static void GiveRentalProperty(ArrayList<Apartment> apartments,ArrayList<House> houses, ArrayList<Villa> villas) {

		//create new JFrame
		JFrame frame1 = new JFrame("MyBnB");

		//add text
		JTextField textID = new JTextField(11);
		JTextField textRentalDays=new JTextField(11);

		//new JButtons
		JButton ok = new JButton("Ok");
		JButton cancel = new JButton("Cancel");
		JPanel panel = new JPanel();

		//adding labels
		JLabel propertyID = new JLabel();
		JLabel rentDays = new JLabel();

		//set frame size
		frame1.setLayout(new GridLayout(5, 0));

		//set titles
		propertyID.setText("Property ID");
		rentDays.setText("Rental Days");

		//add to frame
		panel.add(propertyID);
		panel.add(textID);
		panel.add(rentDays);
		panel.add(textRentalDays);
		panel.add(ok);
		panel.add(cancel);

		frame1.add(panel);
		frame1.setSize(800, 200);


		frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame1.getContentPane().add(BorderLayout.BEFORE_FIRST_LINE, panel);
		frame1.setVisible(true);

	}

}