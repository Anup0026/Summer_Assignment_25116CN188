
import java.util.Scanner;

public class Selection_sort {

    public static void Selection_sort(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            int minidex = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minidex]) {
                    minidex = j;

                }
            }

            int temp = arr[i];
            arr[i] = arr[minidex];
            arr[minidex] = temp;
        }
        System.out.println("Sorted array");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number in the Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the element in the array :");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

        Selection_sort(arr, n);
        sc.close();

    }

}
