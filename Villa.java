//Villa subclass
public class Villa extends Property
{
	int ServiceCost; //Service Cost
	int LuxuryTax;  //Tax
	int NumberOfRooms;  //Number of Rooms
	
	//Villa class Constructor, takes 7 parameters which are:
	//name, PostalAddress, RentalCost, TotalRentalDays, ServiceCost, LuxuryTax and NumberOfRooms
	public Villa(String name, String PostalAddress, int RentalCost, int TotalRentalDays, int ServiceCost, int LuxuryTax, int NumberOfRooms)
	{
		//this is a reference to the object whose method or constructor is being called
		super(name, PostalAddress, RentalCost, TotalRentalDays);
		this.ServiceCost = ServiceCost;
		this.LuxuryTax = LuxuryTax;
		this.NumberOfRooms = NumberOfRooms;
	}
	
	//Accessors - to return values of the variables
	public int getServiceCost()
	{
		return ServiceCost;
	}
	public int getLuxuryTax()
	{
		return LuxuryTax;
	}
	public int getNumberOfRooms()
	{
		return NumberOfRooms;
	}
}