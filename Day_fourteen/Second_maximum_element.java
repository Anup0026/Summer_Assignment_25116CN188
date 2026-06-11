
import java.util.Scanner;
import java.util.Arrays;

public class Second_maximum_element {

    public static void Second_maximum_elements(int[] arr, int n) {

        for (int i = 0; i < n; i++) {

            Arrays.sort(arr);

        }

        System.out.println("Second largest element in the array is = " + arr[n - 2]);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of the element = ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the  elements");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

        Second_maximum_elements(arr, n);

    }
}
