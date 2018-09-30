import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

//output class
public class Output 
{
	Output()
	{

	}
	private static String PropertyFileName = "OutputProperty.txt";
	private static String VehicleFileName = "VehicleFile.txt";

	//print apartment array list to file
	private static void Apartment(ArrayList<Apartment> apartment) throws IOException 
	{
		PrintWriter wr = new PrintWriter(new FileWriter(PropertyFileName, true));

		for (int i = 0; i < apartment.size(); i++) 
		{
			wr.write(apartment.get(i).getRegNum());
			wr.write("Reg Num: " + apartment.get(i).getRegNum());
			wr.write("Name: " + apartment.get(i).getName());
			wr.write("Address: " + apartment.get(i).getPostalAddress());
			wr.write("Rental Cost: " + apartment.get(i).getRentalCost());
			wr.write("Rental Days: " + apartment.get(i).getTotalRentalDays());
			wr.write("Story Number: "+ apartment.get(i).getStoryNum());
			wr.write("No of Beds: " + apartment.get(i).getBedNum());
		}
	}

	//print house array list to file
	private static void House(ArrayList<House> house) throws IOException 
	{
		PrintWriter wr = new PrintWriter(new FileWriter(PropertyFileName, true));

		for (int i = 0; i < house.size(); i++) 
		{
			wr.write("Reg Num: " + house.get(i).getRegNum());
			wr.write("Name: " + house.get(i).getName());
			wr.write("Address: " + house.get(i).getPostalAddress());
			wr.write("Rental Cost : " + house.get(i).getRentalCost());
			wr.write("Rental Days: " + house.get(i).getTotalRentalDays());
			wr.write("Clearing Fees: " + house.get(i).getClearingFees());
			wr.write("No. of Storeys: " + house.get(i).getTotalNumberOfStorys());
			try 
			{
				wr.flush();
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	//print villa array list to file
    private static void Villa(ArrayList<Villa> villa) throws IOException 
    {
        PrintWriter wr = new PrintWriter(new FileWriter(PropertyFileName, true));

        for (int i = 0; i < villa.size(); i++)
        {
            wr.write("Reg Num: " + villa.get(i).getRegNum());
            wr.write("Name: " + villa.get(i).getName());
            wr.write("Address: " + villa.get(i).getPostalAddress());
            wr.write("Rental Cost " + villa.get(i).getRentalCost());
            wr.write("Rental Days " + villa.get(i).getTotalRentalDays());
            wr.write("Service Cost: " + villa.get(i).getServiceCost());
            wr.write("Luxury Tax: " + villa.get(i).getLuxuryTax());
            wr.write("No. of Rooms: " + villa.get(i).getNumberOfRooms());
            try {
                wr.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
  //print car array list to file
    private static void Car(ArrayList<Car> car) throws IOException 
    {
        PrintWriter wr = new PrintWriter(new FileWriter(VehicleFileName, true));

        for (int i = 0; i < car.size(); i++) 
        {
        	wr.write("Name: " + car.get(i).getVehicleOwner());
            wr.write("Rental Cost: " + car.get(i).getVehicleRentalDays());
            wr.write("Rental Days: " + car.get(i).getVehicleCost());
            wr.write("Passengers Number: " + car.get(i).getPasNum());
        }
        
        try {
        	 wr.flush();
        	 } catch (Exception e) {
        	 e.printStackTrace();
        	 }
    }
    
  //print truck array list to file
    private static void Truck(ArrayList<Truck> truck) throws IOException
    {
    	PrintWriter wr = new PrintWriter(new FileWriter(VehicleFileName, true));
    	
    	for (int i = 0; i < truck.size(); i++)  
    	{  		
    		wr.write("Vehicle Owner: " + truck.get(i).getVehicleOwner());
    		wr.write("Rental Cost: " + truck.get(i).getVehicleRentalDays());
    		wr.write("Rental Days: " + truck.get(i).getVehicleCost());
    		wr.write("Cargo Weight: " + truck.get(i).getCargoWeight());
    		try {
    			wr.flush();
    			wr.close();
    		} catch (Exception e) 
    		{
    			e.printStackTrace();
    		}
    	}
    }
}
				