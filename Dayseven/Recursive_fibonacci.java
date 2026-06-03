
import java.util.Scanner;

public class Recursive_fibonacci {

    public static int fibonacci(int n) {

        if (n == 0 || n == 1) {
            return n;

        } else {

            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        int result = fibonacci(n);

        System.out.println("The fibonacci series up to " + n + " n term");

        for (int i = 0; i <= n; i++) {

            System.out.print(fibonacci(i) + "  ");
        }

        sc.close();

    }
}
