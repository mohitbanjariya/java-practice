package armycoder.com;

public class testprime {
	public static void main(String arr[])
	{
		int num=14,count=0;
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
				count++;
			
		}
		if(count==2)
			System.out.println("prime number");
		else
			System.out.println("Not a prime number");	
	}

}
