//import packages used
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.UIManager;

//Main Class
public class Main 
{
	public static void main(String[] args) 
	{
		//create new objects for CalculateTotalIncome and PrintAllProperties
		CalculateTotalIncome c1 = new CalculateTotalIncome();
		PrintAllProperties p1 = new PrintAllProperties();
		
		//declare the ArrayList for apartment, house and villa to store the values
		ArrayList <Apartment> apartment = new ArrayList<Apartment>();
		ArrayList <House> house = new ArrayList<House>();
		ArrayList <Villa> villa = new ArrayList<Villa>();
		
		//Create JFrame and set dimensions
		JFrame frame_parent = new JFrame("MyBnB");
		frame_parent.setLayout(new GridLayout(4, 3));
		frame_parent.setSize(400, 600);

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
				p1.PAP(apartment, house, villa);
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

		//add the buttons and show Frame
		frame_parent.getContentPane().add(button1);
		frame_parent.getContentPane().add(button2);
		frame_parent.getContentPane().add(button3);
		frame_parent.getContentPane().add(label);
		frame_parent.setVisible(true);
		frame_parent.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	//FillInProperties is used to add data to the ArrayList
	public static void FillInProperties(ArrayList<Apartment>apartment, ArrayList<House> house, ArrayList<Villa> villa)
	{
		//enter apartment details: name, address, rental cost, total rental days, story number, number of beds
		apartment.add(new Apartment("Emma","16 Hunters Place",75,5,1,2));
		apartment.add(new Apartment("Fiona","345 Handle Road",75,8,2,3));
		apartment.add(new Apartment("Mason","2 Belgrove Drive",75,6,1,2));
		
		//enter house details: name, address, rental cost, total rental days, number of storys, clearing fees
		house.add(new House("Emma","9 Castleside Dr",85,10,3,45));
		house.add(new House("Fiona","5 Clonskeagh Rd",85,8,2,45));
		house.add(new House("Mason","136 Dalrida Way",85,6,2,45));

		//enter villa details: name, address, rental cost, total rental days, service cost, tax, number of rooms
		villa.add(new Villa("Emma","5 Belarmine Close",95,4,45,65,5));
		villa.add(new Villa("Fiona","8 Sandyford Street",95,3,45,65,6));
		villa.add(new Villa("Mason","124 Marrion Road",95,7,75,55,7));

		//create new JFrame and set dimensions
		JFrame frame = new JFrame("MyBnB Rent");
		frame.setLayout(new GridLayout(4, 3));
		frame.setSize(300, 500);

		//add image from directory and create button, please change to match your directory
		ImageIcon apartmentImage = new ImageIcon(new ImageIcon("/Users/amina/Downloads/apartment.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		JButton Apartment = new JButton(apartmentImage);

		Apartment.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//when the button is pressed, MyBnB - rent - apartment is opened
				JFrame frame1 = new JFrame("Rent Apartment");
				frame1.setLayout(new GridLayout(5, 0));
				frame1.setSize(300, 200);
				UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14)); //set font
				frame1.getContentPane().add(new JLabel("Apartment Number (0,1,2):"));
				JTextArea text1 = new JTextArea(20,10);
				frame1.getContentPane().add(text1);
				frame1.getContentPane().add(new JLabel("Number of Days:"));
				JTextArea text2 = new JTextArea(20,10);
				frame1.getContentPane().add(text2);

				JButton b = new JButton("Confirm") ;
				//add Action Listener
				b.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{ 
						int apartmentNum = Integer.parseInt(text1.getText());
						int rentalDays = Integer.parseInt(text2.getText());
						apartment.get(apartmentNum).RentProperty(rentalDays);
						System.out.print(apartmentNum + rentalDays);
						frame1.getDefaultCloseOperation();
						frame1.dispose();
					}
				});
				//show frame
				frame1.getContentPane().add(b);
				frame1.setVisible(true);
			}
		});

		Apartment.setSize(150,150);
		
		//add image from directory and create button, please change to match your directory
		ImageIcon houseImage = new ImageIcon(new ImageIcon("/Users/amina/Downloads/house.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		JButton House = new JButton(houseImage);
		
		House.setSize(150,150);
		House.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//when the button is pressed, MyBnB - rent - house is opened
				JFrame frame1 = new JFrame("Rent House");
				frame1.setLayout(new GridLayout(5, 0));
				frame1.setSize(300, 200);
				UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));
				frame1.getContentPane().add(new JLabel("House Number (0,1,2):"));
				JTextArea text1 = new JTextArea(20,10);
				frame1.getContentPane().add(text1);
				frame1.getContentPane().add(new JLabel("Number of Days:"));
				JTextArea text2 = new JTextArea(20,10);
				frame1.getContentPane().add(text2);

				JButton b = new JButton("Confirm");
				//add Action Listener
				b.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{ 
						int houseNum = Integer.parseInt(text1.getText());
						int rentalDays = Integer.parseInt(text2.getText());
						house.get(houseNum).RentProperty(rentalDays);
						System.out.print(houseNum + rentalDays);
						frame1.dispose();
					}
				});
				//show Frame
				frame1.getContentPane().add(b);
				frame1.setVisible(true);
			}
		});

		//add image from directory and create button, please change to match your directory
		ImageIcon villaImage = new ImageIcon(new ImageIcon("/Users/amina/Downloads/villa.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		JButton Villa =new JButton(villaImage);
		
		Villa.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//when the button is pressed, MyBnB - rent - villa is opened
				JFrame frame1 = new JFrame("Rent Villa");
				frame1.setLayout(new GridLayout(5, 0));
				frame1.setSize(300, 200);
				UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));
				frame1.getContentPane().add(new JLabel("Villa Number (0,1,2):"));
				JTextArea text1 = new JTextArea(20,10);
				frame1.getContentPane().add(text1);
				frame1.getContentPane().add(new JLabel("Number of Days:"));
				JTextArea text2 = new JTextArea(20,10);
				frame1.getContentPane().add(text2);

				JButton b = new JButton("Confirm") ;
				//add Action Listener
				b.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{ 
						int villaNum = Integer.parseInt(text1.getText());
						int rentD = Integer.parseInt(text2.getText());
						villa.get(villaNum).RentProperty(rentD);
						System.out.print(villaNum+rentD);
						frame1.getDefaultCloseOperation();
						frame1.dispose();
					}
				});
				//show Frame
				frame1.getContentPane().add(b);
				frame1.setVisible(true);
			}
		});

		Villa.setSize(150,150);
		
		//Add apartment, house and villa to the Frame
		frame.getContentPane().add(Apartment);
		frame.getContentPane().add(House);
		frame.getContentPane().add(Villa);

		//Button for Finish
		JButton bclose = new JButton("Complete") ;
		bclose.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//close MyBnB - Rent
				frame.dispose();
			}
		});

		frame.getContentPane().add(bclose);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
	}
}