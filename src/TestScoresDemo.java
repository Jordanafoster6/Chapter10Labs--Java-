
public class TestScoresDemo {

	public static void main(String[] args)  {
		
		int[] array1 = {100, 98, 87, 84, 95, 101, 82, 100, 99, 100};
		
		TestScores test1 = new TestScores(array1);
		try
		{
		System.out.printf("Your average test score is %.02f%%.", test1.getAvg() );
		}
		catch(InvalidTestScore ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
