
public class Payroll {

	private String name;
	private int idNumber;
	private double payRate;
	private int hoursWorked;
	private double grossPay;
	
	public void setName(String n) throws InvalidEmptyString
	{
		if(n.equals(null))
		{
			throw new InvalidEmptyString();
		}
		else
			name = n;
	}
	public void setIdNumber(int id) throws InvalidID
	{
		if(id == 0 || id < 0)
		{
			throw new InvalidID();
		}
		else
			idNumber = id;
	}
	public void setPayRate(double rate) throws InvalidPay
	{
		if(rate < 0 || rate > 25)
		{
			throw new InvalidPay();
		}
		else
			payRate = rate;
	}
	public void setHoursWorked(int hours) throws InvalidHours
	{
		if(hours < 0 || hours > 84)
		{
			throw new InvalidHours();
		}
		else
			hoursWorked = hours;
	}
	
	public String getName()
	{
		return name;
	}
	public int getIdNumber()
	{
		return idNumber;
	}
	public double getPayRate()
	{
		return payRate;
	}
	public int getHoursWorked()
	{
		return hoursWorked;
	}
	
	public double getGrossPay()
	{
		grossPay =(hoursWorked * payRate);
		return grossPay;
	}
	
}
