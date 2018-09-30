//import packages
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

//PrintAllProperties Class
public class PrintAllProperties 
{
	//PAP(Print All Properties) takes the ArrayList parameters, aparment, house and villa
	public void PAP(ArrayList<Apartment> apartment,ArrayList<House> house, ArrayList<Villa> villa) throws FileNotFoundException
	{

		//redirecting print all properties to the outputProperty.txt
		File OutputProperty = new File("OutputProperty.txt");

		try 
		{
			//if file exists print 'file exists'
			if (OutputProperty.exists()) 

			{
				System.out.println("----File exists----");
			}
			//else print created now
			else
			{
				System.out.println("----Created File----");
				OutputProperty.createNewFile();
			}
		} 

		catch(Exception e)
		{
			e.printStackTrace();
		}

		try
		{
			//get details from accessors created in subclass apartment
			PrintWriter printWriter=new PrintWriter(new FileWriter("OutputProperty.txt",false));
			printWriter.write("\nAPARTMENT"+"\n");
			printWriter.write("\n \nReg. Number    Name    Address     Rental Days     Cost Per Day(€)     No of Storys    No of Beds\n");
			for(int i=0;i<apartment.size();i++)
			{       

				printWriter.write("     "+apartment.get(i).getRegNum()+" "+apartment.get(i).getName()+"  "+apartment.get(i).getPostalAddress()+"  "+apartment.get(i).getTotalRentalDays()+"  "+
						apartment.get(i).getRentalCost()+" "+apartment.get(i).getStoryNum()+" "+apartment.get(i).getBedNum()+"\n");
			}    	

			//get details from accessors created in subclass house
			printWriter.write("\n\n"+"HOUSE"+"\n\n");
			printWriter.write("\n"+"\nReg. Number     Name   Address    Rental Days    Cost Per Day(€)   No of Storys   Clearing Fees"+"\n");
			for(int i1=0;i1<house.size();i1++) 
			{
				printWriter.write(""+house.get(i1).getRegNum()+" "+house.get(i1).getName()+" "+house.get(i1).getPostalAddress()+" "+house.get(i1).getTotalRentalDays()+"   "+
						house.get(i1).getRentalCost()+"  "+house.get(i1).getTotalNumberOfStorys()+"  "+house.get(i1).getClearingFees()+"\n");
			}    

			//get details from accessors created in subclass villa
			printWriter.write("\n\n"+"VILLA"+"\n");
			printWriter.write("\nReg. Number     Name    Address   Rental Days   Cost Per Day(€)    No of Rooms     Service Cost   Luxury Tax\"\n"+ ""+ "");

			for(int j=0;j<villa.size();j++) 
			{
				printWriter.write(""+villa.get(j).getRegNum()+" "+villa.get(j).getName()+" "+villa.get(j).getPostalAddress()+"  "+villa.get(j).getTotalRentalDays()+"  "+
						villa.get(j).getRentalCost()+"  "+villa.get(j).getNumberOfRooms()+"    "+villa.get(j).getServiceCost()+"   "+villa.get(j).getLuxuryTax()+"\n");

			}
			printWriter.close();

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
