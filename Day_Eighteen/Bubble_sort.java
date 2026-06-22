
import java.util.Scanner;

public class Bubble_sort {

    public static void Bublle_short(int[] arr, int n) {

        System.out.println("The main output of it ");

        int temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }

        for (int i = 0; i < n; i++) {

            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

        Bublle_short(arr, n);

    }

}
