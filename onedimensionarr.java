package armycoder.com;



public class onedimensionarr {
	private static int j;

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
		
//		for(int i=0; i<=5; i++)
//		{
//			System.out.println(z[i]);
//		}
		System.out.println("-----------------------");
		
		//1st way to create 2dimension array = compile time memory
		int arr1 [][] = {
				        {12,34,5,77,89},
				        {13,45,66,78,97},
				        {11,14,15,56,67}
				   
		            };
		System.out.println(arr1);
		System.out.println(arr1.length);
		System.out.println(arr1[0][0]);
    	System.out.println(arr1[0][1]);
    	System.out.println(arr1[1][1]);
    	System.out.println(arr1[2][2]);
    	System.out.println("--------------------------");
    	
    	
		
    	
    	for(int i=0; i<=arr1.length; i++)
    	{
   		for(int j=0; j<=arr1.length; j++)
    		{
    			System.out.println(arr1[i][j]);
  		}
    		System.out.print("\n");
				
   	}
				int sum=0;
				for(int i=0; i<=arr1.length; i++)
		    	{
		    		for(int j=0; j<=arr1.length; j++)
		    		{
			    			sum=sum+arr1[i][j];
			    	}
			    }
				System.out.println(+sum+"sum of 2d");
    	
		//2nd way to create 2dimension array = run time memory memory allocation
		System.out.println("--------------------------");
		
		int[][] arr2 = new int [3][4];
		arr2[0][0] = 12;
		arr2[0][1] = 11;
		arr2[0][2] = 13;
		arr2[0][3] = 14;
		
		arr2[1][0] = 16;
		arr2[1][1] = 15;
		arr2[1][2] = 17;
		arr2[1][3] = 18;
		
		arr2[2][0] = 19;
		arr2[2][1] = 11;
		arr2[2][2] = 13;
		arr2[2][3] = 14;
		
		
		
		for(int i=0; i<=arr2.length; i++)
		{
			for(int j=0; j<=arr2.length; j++)
			{
			
				System.out.println(arr2[i][j]);
			}
			System.out.print("\n");
		}
		
		
	}

}
