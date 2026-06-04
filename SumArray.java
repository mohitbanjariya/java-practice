package armycoder.com;

public class SumArray {
    public static void main(String[] args) {

        int arr1[][] = {
            {12, 34, 5, 77, 89},
            {13, 45, 66, 78, 97},
            {11, 14, 15, 56, 67}
        };

        int sum = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                sum += arr1[i][j];
            }
        }

        System.out.println(sum + " sum of 2d array");
    }
}