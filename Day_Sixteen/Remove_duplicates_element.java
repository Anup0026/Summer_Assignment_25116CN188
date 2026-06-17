
import java.util.Scanner;

public class Remove_duplicates_element {

    public static void removing_Duplicates_Elements(int[] arr, int n) {

        System.out.println("The elements in the array is without  duplicates element");

        for (int i = 0; i < n; i++) {

            boolean duplicates = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {

                    duplicates = true;
                }
            }

            if (!duplicates) {

                System.out.println(arr[i]);
            }

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        removing_Duplicates_Elements(arr, n);

        System.out.println("Thank_you this program has been terminated Successfully");

    }

}
