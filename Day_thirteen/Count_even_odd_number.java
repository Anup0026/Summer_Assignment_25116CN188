
import java.util.Scanner;

public class Count_even_odd_number {

    public static void Count_even_odd_number(int[] arr, int n) {

        int Count_even = 0;
        int Count_odd = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                Count_even++;
            } else {
                Count_odd++;
            }

        }

        System.out.println("The total even number is given in the array is = " + Count_even);
        System.out.println("The total odd number is given in the array is = " + Count_odd);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the  elements ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        Count_even_odd_number(arr, n);

        sc.close();

    }

}
