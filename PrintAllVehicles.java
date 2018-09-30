//import packages
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
//print all vehicle
public class PrintAllVehicles
{
	public void PAV(ArrayList<Car> car, ArrayList<Truck> truck) throws FileNotFoundException
	{
		File OutputVehicle = new File("OutputVehicle.txt");
		//check if file exists
		//if not create file
		try {
			if (OutputVehicle.exists()) 

			{
				System.out.println("----File exists----");
			}
			else
			{
				System.out.println("----File Created----");
				OutputVehicle.createNewFile();
			}
			} 
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
			
		try 
		{

			PrintWriter printWriter;

			printWriter = new PrintWriter(new FileWriter("OutputVehicle",false));

			//get details from accessors created in subclass car
			printWriter.write("CARS"+"\n");
			printWriter.write("\n \nName , Vehicle Rental Days, Vehicle Cost Per Day, Passenger Number\n");
			for(int i=0;i<car.size();i++)
			{       

				printWriter.write("  "+car.get(i).getVehicleOwner()+" "+car.get(i).getVehicleRentalDays()+"  "+car.get(i).getVehicleCost()+"  "+car.get(i).getPasNum()+"\n");
			}    

			printWriter.write("TRUCK"+"\n");
			printWriter.write("\n \nName , Vehicle Rental Days, Vehicle Cost Per Day, Cargo Weight");
			for(int i=0;i<truck.size();i++)
			{       

				printWriter.write("  "+truck.get(i).getVehicleOwner()+" "+truck.get(i).getVehicleRentalDays()+"  "+truck.get(i).getVehicleCost()+"  "+truck.get(i).getCargoWeight()+"\n");
			}    
			printWriter.close();

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
