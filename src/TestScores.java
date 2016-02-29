
public class TestScores {
	
	private int[] testArray;
	
	public TestScores(int[] array)
	{
		testArray = array;
	}
	
	public double getAvg() throws InvalidTestScore
	{
		double total = 0;
		for(int count = 0; (count + 1) < testArray.length; ++count)
		{
			if (testArray[count] > 100 || testArray[count] < 0)
			{
				 throw new InvalidTestScore(testArray[count]);
			}
			else
				total += testArray[count];	
		}
		return total / testArray.length;
	}
	
}
