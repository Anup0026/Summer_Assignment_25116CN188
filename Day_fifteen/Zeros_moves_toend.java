import java.util.Scanner;

public class Zeros_moves_toend {

    public static void Zeros_moves_toend(int[] arr, int n) {
        int index = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] != 0) {

                arr[index] = arr[i];
                index++;
            }

        }

        while (index < n) {
            arr[index] = 0;
            index++;

        }

        System.out.println("Arrays after moving to the end ");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + "  ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element or the total number of the element : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element in the array ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Zeros_moves_toend(arr, n);

        sc.close();
    }

}
