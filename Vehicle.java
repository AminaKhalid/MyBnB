//Vehicle Superclass 
public class Vehicle 
{
	//3 variables that are inherited by the car and truck subclasses
	String vOwner; //owner name
	int vTotalRentalDays; //total rental days
	int vTotalCost; //total cost per day
	
	//Vehicle Constructor, takes 3 parameters, which are:
	public Vehicle(String vOwner, int vTotalRentalDays, int vTotalCost)
	{
		//this is a reference to the object whose method or constructor is being called
		this.vOwner = vOwner;
		this.vTotalRentalDays = vTotalRentalDays;
		this.vTotalCost = vTotalCost;
	}
	
	//mutator, to increase the number of total rental days
	public void vRentProperty(int vRentalDays)
	{
		vTotalRentalDays+=vRentalDays;
	}
	
	//Accessors - to return the values of the variables
	public String getVehicleOwner()
	{
		return vOwner;
	}
	
	public int getVehicleRentalDays()
	{
		return vTotalRentalDays;
	}
	
	public int getVehicleCost()
	{
		return vTotalCost;
	}

}
