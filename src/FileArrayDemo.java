import java.io.IOException;

public class FileArrayDemo {

	public static void main(String[] args) throws IOException {

		int[] array1=new int[10];
		
		FileArray fa1 = new FileArray();
		
		fa1.readArray("FileArrayDemonstration.dat", array1);
		
		for(int x : array1)
		{
			System.out.println(x);
		}

	}

}
