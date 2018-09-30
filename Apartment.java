//apartment subclass
public class Apartment extends Property
{

	int StoryNum; //story number
	int BedNum; //number of beds

	//Apartment class Constructor, takes 6 parameters which are:
	//name, PostalAddress, RentalCost, TotalRentalDays, StoryNum and BedNum
	public Apartment(String name, String PostalAddress, int RentalCost, int TotalRentalDays, int StoryNum, int BedNum)
	{
		//this is a reference to the object whose method or constructor is being called
		super(name, PostalAddress, RentalCost, TotalRentalDays);
		this.StoryNum = StoryNum;
		this.BedNum = BedNum;
	}

	//Accessors - to return values of the variables
	public int getStoryNum()
	{
		return StoryNum;
	}
	public int getBedNum()
	{
		return BedNum;
	}

}