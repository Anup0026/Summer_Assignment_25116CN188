import java.util.Scanner;

public class frequency_of_an_element {

    public static void frequency_of_an_element(int[] arr, int n, int key) {

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {

                count++;

            }
        }

        System.out.println("The frequency of the key or searched element " + key + " is = " + count);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element which frequency is required = ");

        int key = sc.nextInt();

        frequency_of_an_element(arr, n, key);

    }

}
