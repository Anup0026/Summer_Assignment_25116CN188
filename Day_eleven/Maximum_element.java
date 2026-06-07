
import java.util.Scanner;

public class Maximum_element {

    public static void Maximun_element(int[] arr, int n) {

        int max = arr[0];
        for (int i = 0; i < n; i++) {

            if (arr[i] > max) {
                max = arr[i];

            }

        }

        System.out.println("The maximum number is  = " + max);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of the element ");
        int n = sc.nextInt();

        System.out.println("Enter the elements ");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Maximun_element(arr, n);
        sc.close();

    }

}
