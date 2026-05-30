package armycoder.com;

public class testnestedloop {
//	public static void main(String arr[])	{
//		for(int i=1; i<=5; i++)
//		{
//		for(int j=1; j<=i; j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}
	
//	public static void main(String arr[])
//	{
//		for(int i=1; i<=5; i++)
//		{
//			for(int k=4; k>=i; k--)
//			{
//				System.out.print(" ");
//			}
//			for(int j=i; j<=5; j++)
//			{
//				System.out.print("* ");	
//			}
//			System.out.println();
//		}
//	}
	
//	public static void main(String arr[])
//	{
//		for(int i=1; i<=5; i++)
//	{
//			for(int k=1; k<=4-i; k++)
//			{
//				System.out.print(" ");
//			}
//		for(int j=1; j<=i; j++)
//			{
//				System.out.print("* ");	
//			}
//			System.out.println();
//		}
//	}
	
	public class Main {
	    public static void main(String arr[]) {

	        for (int i = 1; i <= 4; i++) {

	           
	            for (int j = 4; j >= i; j--) {
	                System.out.print(" ");
	            }

	            // Print stars and hollow spaces
	            for (int k = 1; k <= i; k++) {

	                if (i > 2 && i < 5) {

	                    if (k > 1 && k < i) {
	                        System.out.print("  ");
	                    } else {
	                        System.out.print("* ");
	                    }

	                } else {
	                    System.out.print("* ");
	                }
	            }

	            System.out.println();
	        }
	    }
	}
}

	
	
		
			
	
