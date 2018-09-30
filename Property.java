//Property Superclass 
public class Property 
{
	//6 variables that are inherited by the apartment, house and villa subclasses
	int RegNum; //registration number
	String name; //owner name
	String PostalAddress; //Postal address
	int RentalCost; //rental cost per day
	int TotalRentalDays; //total rental days
	static int counter; //counter to increase Registration Number

	//Property Constructor, takes 4 parameters, which are:
	//name, PostalAddress, RentalCost and TotalRentalDays
	public Property(String name, String PostalAddress, int RentalCost, int TotalRentalDays)
	{
		//this is a reference to the object whose method or constructor is being called
		this.RegNum = counter++;
		this.name = name;
		this.PostalAddress = PostalAddress;
		this.RentalCost = RentalCost;
		this.TotalRentalDays = TotalRentalDays;
	}

	//mutator, to increase the number of total rental days
	public void RentProperty(int RentalDays){
		TotalRentalDays+=RentalDays;
	}
	
	//Accessors - to return the values of the variables
	public int getRegNum()
	{
		return RegNum;
	}
	public String getName()
	{
		return name;
	}
	public String getPostalAddress()
	{
		return PostalAddress;
	}
	public int getRentalCost()
	{
		return RentalCost;
	}
	public int getTotalRentalDays()
	{
		return TotalRentalDays;
	}


}
