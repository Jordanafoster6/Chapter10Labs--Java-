
public class InvalidTestScore extends Exception {

	public InvalidTestScore()
	{
		super("Error: You entered an invalid test score.");
	}
	
	public InvalidTestScore(double score)
	{
		super("Error: You entered an invalid test score, " + score);
	}
	
}
