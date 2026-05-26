package armycoder.com;

public class testbasanti {
	public static void main(String arr[])
	{
		 boolean jabtakhaijaan=true;
		 int round=1;
		 
		 while(jabtakhaijaan) {
			 System.out.println("mai basanti nachungi:"+round);
			 round++;
			 if(round>400) {
				 jabtakhaijaan=false;
				 System.out.println("basanti mar chuki:");
			 }
		 }
	}

}
