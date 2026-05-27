package armycoder.com;

public class testarmstrong {
	public static void main(String arr[])
	{
		int num=153,sum=0,original=num,rem;
		
		for(;num>0; num=num/10)
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
		}
		if(sum==original)
			System.out.println("armstrong number:");
		else
			System.out.println("Not a armstrong number:");
		}

	}


