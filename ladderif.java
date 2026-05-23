package armycoder.com;

public class ladderif {
	public static void main(String arr[])
	{
		float perc = 80;
		if(perc>=100)
			System.out.println("invalid percentage");
		else if(perc>=90)
			System.out.println("manny congratulation");
		else if(perc>=60)
			System.out.println("first division");
		else if(perc>=45)
			System.out.println("second division");
		else if(perc>=33)
			System.out.println("third division");
		else
			System.out.println("failed");
		
	}

}
