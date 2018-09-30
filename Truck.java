//Truck subclass
public class Truck extends Vehicle{

	int CargoWeight; //Cargo Weight
	
	//Car class Constructor, takes 4 parameters which are:
	public Truck(String vOwner, int vTotalRentalDays, int vTotalCost, int CargoWeight) 
	{
		super(vOwner, vTotalRentalDays, vTotalCost);
		//this is a reference to the object whose method or constructor is being called
		this.CargoWeight = CargoWeight;
	}

	//Accessors - to return values of the variables
	public int getCargoWeight()
	{
		return CargoWeight;
	}
	
}
