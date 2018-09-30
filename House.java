//House subclass
public class House extends Property
{
	int TotalNumberOfStorys; //the Total Number of Storys
	int ClearingFees;  //Clearing Fees

	//House class Constructor, takes 6 parameters which are:
	//name, PostalAddress, RentalCost, TotalRentalDays, TotalNumberOfStorys and ClearingFees
	public House(String name, String PostalAddress, int RentalCost, int TotalRentalDays, int TotalNumberOfStorys, int ClearingFees)
	{
		//this is a reference to the object whose method or constructor is being called
		super(name, PostalAddress, RentalCost, TotalRentalDays);
		this.TotalNumberOfStorys = TotalNumberOfStorys;
		this.ClearingFees = ClearingFees;
	}

	//Accessors - to return values of the variables
	public int getTotalNumberOfStorys()
	{
		return TotalNumberOfStorys;
	}
	public int getClearingFees()
	{
		return ClearingFees;
	}
}