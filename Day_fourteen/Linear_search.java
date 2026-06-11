import java.util.Scanner;

public class Linear_search {

    public static void Linear_search(int n, int[] arr, int key) {
        for (int i = 0; i < n; i++) {

            if (arr[i] == key) {
                System.out.println("Element is found at index " + i + " is = " + arr[i]);
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of the element = ");
        int n = sc.nextInt();

        System.out.println("Enter the  element to be searched = ");
        int key = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements in the array ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        Linear_search(n, arr, key);

    }

}
