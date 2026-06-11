
import java.util.*;

public class Max_Min_in_the_array {

    public static void Max_or_min(int[] arr, int n) {

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The minimum number in the entered " + n + " number is  = " + min);

        System.out.println("The maximum number in the entered " + n + " number is  = " + max);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number =");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements ");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }
        System.out.println("The maximum  and the minimum element are following ");

        Max_or_min(arr, n);

        sc.close();

    }

}
