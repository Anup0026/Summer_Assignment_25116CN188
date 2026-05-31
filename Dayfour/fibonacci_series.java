
import java.util.Scanner;

public class fibonacci_series {

    public static void fibonacci_series(int n) {

        int a = 0;
        int b = 1;
        for (int i = 3; i <= n; i++) {

            int c = a + b;

            System.out.println(c + "   ");

            a = b;
            b = c;

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        System.out.println("======================== fibonacci series =======================\n");

        fibonacci_series(n);

        System.out.println("\n");

        System.out.println("--Thanks--\n");

    }

}
