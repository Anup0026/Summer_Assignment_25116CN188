
import java.util.Scanner;

public class Check_perfect_number {

    public static void perfect_number(int n) {

        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {

            if (n % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == n) {
            System.out.println("Given number is the perfect number ");
        } else {

            System.out.println("The given number is not the perfect number");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");

        int n = sc.nextInt();

        perfect_number(n);

    }

}
