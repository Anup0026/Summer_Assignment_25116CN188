
import java.util.Scanner;

public class Recursive_factorial {
    public static int factorial(int n) {

        int fact = 1;
        if ((n == 0) || (n == 1)) {
            return 1;
        } else {

            return n * factorial(n - 1);

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        int result = factorial(n);

        System.out.println("The factorial of the number " + n + " is = " + result);

    }

}
