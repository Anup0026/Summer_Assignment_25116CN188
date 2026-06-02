
import java.util.Scanner;

public class Check_number {
    public static void Check_number(int n) {

        int original = n;
        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            int fact = 1;

            for (int i = 1; i <= digit; i++) {

                fact *= i;
            }
            sum += fact;
            n = n / 10;

        }

        if (sum == original) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a Strong Number");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        Check_number(n);

    }

}
