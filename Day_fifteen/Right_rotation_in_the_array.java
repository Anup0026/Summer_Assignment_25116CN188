
import java.util.Scanner;

public class Right_rotation_in_the_array {

    public static void Left_Rotation_in_the_array(int[] arr, int n) {
        int temp = arr[n - 1]; // 10 20 30 40 50

        for (int i = n - 1; i > 0; i--) {

            arr[i] = arr[i - 1];

        }

        for (int i = 0; i < n; i++) {
            arr[0] = temp;

            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of the element ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements ");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        System.out.println("The elements are ");

        Left_Rotation_in_the_array(arr, n);

    }

}
