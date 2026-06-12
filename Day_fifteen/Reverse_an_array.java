
import java.util.Scanner;

public class Reverse_an_array {

    public static void Reverse_an_array(int[] arr, int n) {

        for (int i = n - 1; i >= 0; i--) {

            System.out.println(arr[i] + " ");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the totoal number of the element  : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element in the given array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The reverse of  the array are the following ");

        Reverse_an_array(arr, n);

    }

}
