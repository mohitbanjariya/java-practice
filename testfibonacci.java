package armycoder.com;

public class testfibonacci {
	public static void main(String arr[])
	{
		int a=0,b=1;
		for(int i=1; i<=10; i++)
		{
			System.out.println(a);
			a=a+b;
			b=a-b;
		}
	}

}
