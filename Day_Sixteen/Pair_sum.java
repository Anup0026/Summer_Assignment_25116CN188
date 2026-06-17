import java.util.Scanner;

public class Pair_sum {

    public static void sum(int[] arr, int n, int sum) {

        int i;
        int j;
        for (i = 0; i < n; i++) {

            for (j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {

                    System.out.println(arr[i] + " , " + arr[j]);

                }

            }

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of element :");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println("enter the value of sum of two element :");
        int sum = sc.nextInt();

        System.out.println("The pair elements are :");

        sum(arr, n, sum);

    }

}
