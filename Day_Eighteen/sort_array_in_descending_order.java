import java.util.Scanner;

public class sort_array_in_descending_order {

    public static void sort_array_in_descending_order(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array in the descending order ");
        for (int i = 0; i < n; i++) {

            System.out.println(arr[i] + " ");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sort_array_in_descending_order(arr, n);
    }
}
