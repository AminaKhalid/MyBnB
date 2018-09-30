//import packages
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

//PrintAllProperties Class
public class PrintAllProperties 
{
	PrintAllProperties()
	{

	}

	//PAP(Print All Properties) takes the ArrayList parameters, aparment, house and villa
	public void PAP(ArrayList<Apartment> apartment,ArrayList<House> house, ArrayList<Villa> villa)
	{
		//create JFrame and set dimensions
		JFrame frame = new JFrame("MyBnB");
		frame.setLayout(new GridLayout(15, 0));
		frame.setSize(1000, 600);

		//print apartment details onto the JFrame and getting details using JOption Pane
		UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));
		frame.getContentPane().add(new JOptionPane("APARTMENTS"));
		frame.getContentPane().add(new JOptionPane("Reg. Number    Name           Address                      Rental Days         Cost Per Day(€)       No of Storys      No of Beds"));
		UIManager.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 14)); //set font
		
		//get details from accessors created in subclass apartment
		for(int i=0;i<apartment.size();i++)
		{
			frame.getContentPane().add(new JOptionPane(("     "+apartment.get(i).getRegNum()+"                  "+apartment.get(i).getName()+"           "+apartment.get(i).getPostalAddress()+"                         "+apartment.get(i).getTotalRentalDays()+"                           "+
					apartment.get(i).getRentalCost()+"                          "+apartment.get(i).getStoryNum()+"                     "+apartment.get(i).getBedNum())));
		}
		
		//print house details onto the JFrame and getting details using JOption Pane
		UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14)); //set font
		frame.getContentPane().add(new JOptionPane("HOUSES"));
		frame.getContentPane().add(new JOptionPane("Reg. Number     Name           Address                      Rental Days         Cost Per Day(€)       No of Storys       Clearing Fees"));
		UIManager.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 14)); //set font

		//get details from accessors created in subclass house
		for(int i=0;i<house.size();i++)
		{
			frame.getContentPane().add(new JOptionPane("     "+house.get(i).getRegNum()+"                  "+house.get(i).getName()+"           "+house.get(i).getPostalAddress()+"                         "+house.get(i).getTotalRentalDays()+"                           "+
					house.get(i).getRentalCost()+"                          "+house.get(i).getTotalNumberOfStorys()+"                     "+house.get(i).getClearingFees()));
		}

		//print villa details onto the JFrame and getting details using JOption Pane
		UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14)); //set font
		frame.getContentPane().add(new JOptionPane("VILLAS"));
		frame.getContentPane().add(new JOptionPane("Reg. Number     Name           Address                     Rental Days         Cost Per Day(€)       No of Rooms     Service Cost       Luxury Tax"));
		UIManager.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 14)); //set font
		 
		//get details from accessors created in subclass villa
		for(int i=0;i<villa.size();i++)
		{
			frame.getContentPane().add(new JOptionPane("     "+villa.get(i).getRegNum()+"              "+villa.get(i).getName()+"           "+villa.get(i).getPostalAddress()+"                         "+villa.get(i).getTotalRentalDays()+"                           "+
					villa.get(i).getRentalCost()+"                          "+villa.get(i).getNumberOfRooms()+"                     "+villa.get(i).getServiceCost()+"                     "+villa.get(i).getLuxuryTax()));
		}

		//show frame
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	} 


}	