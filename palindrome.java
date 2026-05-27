package armycoder.com;

public class palindrome {
	public static void main(String arr[])
	{
		int num=123,rev=0,original=num,rem;
		for(;num>0; num=num/10)
		{
			 rem=num%10;
			rev=rev*10+rem;
		}
		if(original==rev)
			System.out.println("palindrome");
		else
			System.out.println("Not a palindrome");
	}

}
