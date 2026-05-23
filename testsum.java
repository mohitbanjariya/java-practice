package armycoder.com;

public class testsum {
	public static void main(String arr[])
	{
		int i=1,evsum = 0,odsum=0;
		while(i<=100)
		{
		  if(i%2==0) {	
			evsum+=i;
	}
		  else {
			  odsum+=i;
		  }
		  i++;
		}
		
		System.out.println("sum of all even="+evsum);
		System.out.println("sum of all odd="+odsum);
	}

}
