//car subclass
public class Car extends Vehicle 
{

	int PasNum; //Number of Passengers
	
	//Car class Constructor, takes 4 parameters which are:
	public Car(String vOwner, int vTotalRentalDays, int vTotalCost, int PasNum) 
	{
		super(vOwner, vTotalRentalDays, vTotalCost);
		//this is a reference to the object whose method or constructor is being called
		this.PasNum = PasNum;
	}
	
	//Accessors - to return values of the variables
	public int getPasNum()
	{
		return PasNum;
	}

}
