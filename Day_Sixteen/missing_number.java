import java.util.Scanner;

public class missing_number {

    public static int sum_of_all_number_without_missing_number(int n) {

        System.out.println("Sum of all number without missing any number");

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);

        return sum;
    }

    public static int sum_of_all_number_involving_missing_number(int[] arr, int n) {

        System.out.println("Sum of all number but missing number is not involved :");
        int missing_sum = 0;

        for (int i = 0; i < n; i++) {
            missing_sum += arr[i];

        }

        System.out.println(missing_sum);

        return missing_sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element in the array:");
        for (int i = 0; i < n - 1; i++) {

            arr[i] = sc.nextInt();

        }

        int Actual_sum = sum_of_all_number_without_missing_number(n);
        int missing_sum = sum_of_all_number_involving_missing_number(arr, n);

        System.out.println("The missing number is : " + (Actual_sum - missing_sum));
        System.out.println("Thank_you program has been terminated successfully");

    }

}
