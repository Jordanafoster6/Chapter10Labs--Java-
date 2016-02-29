import java.io.*;

public class FileArray {

	public static void writeArray(String filename, int[] array) throws IOException
	{
		FileOutputStream fstream = new FileOutputStream(filename);
		DataOutputStream outputFile = new DataOutputStream(fstream);
		
		System.out.println("Writing to the file...");
		
		//Writing array to binary file
		for (int i = 0; i < array.length; i++)
		{
			outputFile.writeInt(array[i]);
		}
		
		outputFile.close();
		System.out.println("Done.");
	}
	
	public static void readArray(String filename, int[] array) throws IOException
	{
		int number;
		boolean endOfFile = false;
		
		FileInputStream fstream = new FileInputStream(filename);
		DataInputStream inputFile = new DataInputStream(fstream);
		
		System.out.println("Reading contents from the file...");
		
		//int[] array2;
		int i = 0;
		//Read data from file
		while(!endOfFile)
		{
			try{
				number = inputFile.readInt();
				array[i] = number;
				++i;
			}
			catch (EOFException e){
				endOfFile = true;
			}
		}
		
		inputFile.close();
		System.out.println("\nDone.");
	}
	
}
