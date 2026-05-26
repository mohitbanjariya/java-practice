package armycoder.com;

public class testforlop {
	public static void main(String arr[])
	{
		int evsum=0,odsum=0;
		for(int i=1; i<=100; i++)
		{
			
			if(i%2==0)
		    evsum+=i;
			else
			odsum+=i;
		}
		System.out.println("sum of all even:"+evsum);
		System.out.println("sum of all even:"+odsum);
	}

}
