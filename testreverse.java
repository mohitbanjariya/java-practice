package armycoder.com;

public class testreverse {
	public static void main(String arr[])
	{
		int rev=0,num = 2644,rem;
		while(num!=0){
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		System.out.println("reverse no. is:"+rev);
		
	}

}
