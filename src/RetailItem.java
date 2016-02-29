
public class RetailItem {

	private String description;
	private int unitsOnHand;
	private double price;
	
	public void setDescription(String des)
	{
		description = des;
	}
	public void setUnits(int units) throws InvalidUnitNumber
	{
		if(units < 0)
		{
			throw new InvalidUnitNumber(units);
		}
		else
			unitsOnHand = units;
	}
	
	public void setPrice(double p)throws InvalidPrice
	{
		if(p < 0)
		{
			throw new InvalidPrice(p);
		}
		else
			price = p;
	}
	public String getDescription()
	{
		return description;
	}
	public int getUnits()
	{
		return unitsOnHand;
	}
	public double getPrice()
	{
		return price;
	}
	
	
}
