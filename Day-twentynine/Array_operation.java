
import java.util.Scanner;
import java.util.Arrays;

public class Array_operation {

    public static void Display_Elements(int[] arr, int n) {

        System.out.println("Displayed Elements ");

        for (int i = 0; i < n; i++) {

            System.out.println(arr[i]);

        }
    }

    public static void search_element(int[] arr, int n) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element to be Searched in the entered element: ");
        int key = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (key == arr[i]) {

                System.out.println("Elemnet found at index : " + (i));

            }
        }

    }

    public static void Delete_Element(int[] arr, int n) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element to be deleted : ");
        int delete = sc.nextInt();
        for (int i = 0; i < n; i++) {

            if (delete == arr[i]) {

                System.out.println(+arr[i] + " element has been deleted successfully ");

            }

        }

    }

    public static void Smallest_Element(int[] arr, int n) {

        int min = arr[0];

        for (int i = 0; i < n; i++) {

            if (min > arr[i]) {

                min = arr[i];
            }

        }

        System.out.println("The minimum element is :" + min);

    }

    public static void Largest_Element(int[] arr, int n) {

        int max = arr[0];

        for (int i = 0; i < n; i++) {

            if (max < arr[i]) {

                max = arr[i];
            }

        }

        System.out.println("The maximum element is :" + max);

    }

    public static void sum(int n, int[] arr) {

        System.out.println("Sum of all the elements ");

        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

        }

        System.out.println(sum);
    }

    public static void Sorting_Of_Array(int[] arr, int n) {

        System.out.println("Sorting of an Array :");

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of element : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements ");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

        System.out.println("------------------------------------------");

        Display_Elements(arr, n);
        search_element(arr, n);

        Smallest_Element(arr, n);
        Largest_Element(arr, n);
        sum(n, arr);
        Sorting_Of_Array(arr, n);
        Delete_Element(arr, n);
        System.out.println();
        System.out.println("------------------------------------------");

        sc.close();

    }

}
