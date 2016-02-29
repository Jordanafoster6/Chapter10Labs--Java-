import java.util.Scanner;

public class PayrollDemo {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		Payroll p1 = new Payroll();
		
		try{
			System.out.print("Enter your name.");
			p1.setName(keyboard.nextLine());
		}
		catch(InvalidEmptyString ex)
		{
			System.out.println(ex.getMessage());
		}
		
		try{
			System.out.print("Enter your id number.");
			p1.setIdNumber(keyboard.nextInt());
		}
		catch(InvalidID ex)
		{
			System.out.println(ex.getMessage());
		}
		
		try{
			System.out.print("Enter your pay rate.");
			p1.setPayRate(keyboard.nextDouble());
		}
		catch(InvalidPay ex)
		{
			System.out.println(ex.getMessage());
		}
		
		try{
			System.out.print("Enter your hours worked.");
			p1.setHoursWorked(keyboard.nextInt());
		}
		catch(InvalidHours ex)
		{
			System.out.println(ex.getMessage());
		}
		
		System.out.println("----------------------------");
		System.out.printf("Employee: %s \n", p1.getName());
		System.out.printf("ID Number: %d \n", p1.getIdNumber());
		System.out.printf("Pay Rate: %.2f \n", p1.getPayRate());
		System.out.printf("Hours Worked: %d \n", p1.getHoursWorked());
		System.out.printf("Gross Pay: %.2f \n", p1.getGrossPay());
		System.out.println("---------------------------- \n");
		
		keyboard.close();
		
	}
	
}
