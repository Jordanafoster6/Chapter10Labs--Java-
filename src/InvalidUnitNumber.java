
public class InvalidUnitNumber extends Exception {
	
	public InvalidUnitNumber()
	{
		super("Error: You entered an invalid number of units.");
	}
	
	public InvalidUnitNumber(int unitNum)
	{
		super("Error: You entered an invalid number of units, " + unitNum);
	}
}
