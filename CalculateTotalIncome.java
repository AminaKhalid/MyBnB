//import package
import java.util.ArrayList;

// Calculate Total Income Class
public class CalculateTotalIncome
{
	CalculateTotalIncome()
	{

	}

	//CalculateTotalIncome takes 3 parameters, the ArrayList of apartment, house and villa
	public int CalculateTotallIncome(ArrayList<Apartment> apartment,ArrayList<House> house, ArrayList<Villa> villa )
	{
		//set TotalRental income to 0
		int TotalRentalIncome=0;
		
		//Income calculation for apartment = RentalCost * RentalDays
		for(int i=0;i<apartment.size();i++)
			TotalRentalIncome+=(apartment.get(i).getRentalCost()) * (apartment.get(i).getTotalRentalDays());

		//Income calculation for house = (RentalCost * RentaDays) + Clearing Fees
		for(int i=0;i<house.size();i++)
			TotalRentalIncome+=(house.get(i).getRentalCost()*house.get(i).getTotalRentalDays()) + (house.get(i).getClearingFees());

		//Income calculation for villa = (RentalDays + Service Cost + Tax) * RentalCost
		for(int i=0;i<villa.size();i++)
			TotalRentalIncome+=(villa.get(i).getTotalRentalDays()+villa.get(i).getServiceCost()+villa.get(i).getLuxuryTax()) * (villa.get(i).getRentalCost());
		
		//return the value of calculation
		return TotalRentalIncome;
	}
}
