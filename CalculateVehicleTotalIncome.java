import java.util.ArrayList;

public class CalculateVehicleTotalIncome {

	CalculateVehicleTotalIncome()
	{
		
	}
	
	public int CalculateVehicleTotalIncome(ArrayList<Car> car,ArrayList<Truck> truck)
	{
		//set income to 0
		int TotalVehicleRentalIncome=0;
		
		//Income calculation for car = RentalCost * RentalDays * passengers
		for(int i=0;i<car.size();i++)
		{
			TotalVehicleRentalIncome+=(car.get(i).getVehicleCost()) * (car.get(i).getVehicleRentalDays() * (car.get(i).getPasNum()));
		}
		//Income calculation for truck = RentalCost * RentaDays * Cargo Weight
		for(int i=0;i<truck.size();i++)
		{
			TotalVehicleRentalIncome+=(truck.get(i).getVehicleCost()) * (truck.get(i).getVehicleRentalDays() * (truck.get(i).getCargoWeight()));
		}
		return TotalVehicleRentalIncome;
}
}
