
import java.util.Scanner;

public class fibonacci_series {

    public static void Fibonacci_Series(int n) {

        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {

            System.out.print(a + "   ");

            int c = a + b;
            a = b;
            b = c;

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        System.out.println("The given fibonacci series is till the entered number");

        Fibonacci_Series(n);

        sc.close();
    }

}
