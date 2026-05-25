package armycoder.com;
import java.util.Scanner;

public class Sumofsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit);
            num = num / 10;
        }

        System.out.println("Sum of squares of digits = " + sum);
    }
}

	