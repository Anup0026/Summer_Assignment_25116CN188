
import java.util.Scanner;

public class factorial_of_number {

    public static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("User entered negative number");
        } else {
            int result = factorial(n);

            System.out.println("The factorial of the given number is = " + result);
        }

    }
}
