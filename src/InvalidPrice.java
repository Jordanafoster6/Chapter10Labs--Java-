
public class InvalidPrice extends Exception {

	public InvalidPrice()
	{
		super("Error: You entered an invalid price.");
	}
	
	public InvalidPrice(double price)
	{
		super("Error: You entered an invalid price number, " + price);
	}
}
