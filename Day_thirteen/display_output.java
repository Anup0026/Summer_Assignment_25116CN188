import java.util.Scanner;

public class display_output {

    public static void display_output(int[] arr, int n) {

        System.out.println("The elements are the following : ");

        for (int i = 0; i < n; i++) {

            System.out.println(arr[i]);

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements : ");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

        display_output(arr, n);
    }

}
