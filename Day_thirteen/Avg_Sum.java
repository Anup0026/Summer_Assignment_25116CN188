
import java.util.Scanner;

public class Avg_Sum {

    public static void Avg_Sum(int[] arr, int n) {

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int avg_sum = sum / n;

        System.out.println("The sum of the entered " + n + " number is = " + sum);

        System.out.println("The avg_sum of the  entered " + n + " number is = " + avg_sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter the elements  ");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

        Avg_Sum(arr, n);

    }

}
