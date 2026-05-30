package armycoder.com;

public class onedimensionarr {
	public static void main(String arr[])
	{
		//1st way to create one dimension array = compile time memory
		int x[] = {12,34,5,77,89};
		
		//2nd way to create one dimension array = run time memory memory allocation
		int y[] = new int [5];
		y[0] = 23;
		y[1] = 13;
		y[2] = 24;
		y[3] = 29;
		y[4] = 93;
		
		//3rd way to create one dimension array = run time memory memory allocation
		int z[] = new int[] {12,34,23,34,56};
		
		for(int i=0; i<=5; i++)
		{
			System.out.println(z[i]);
		}
		
		
	}

}
