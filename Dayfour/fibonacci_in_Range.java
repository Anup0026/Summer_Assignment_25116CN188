
import java.util.Scanner;

public class fibonacci_in_Range {

    public static void fibonacci_in_Range(int first, int last) {

        int a = 0;
        int b = 1;

        while (a <= last) {

            if (a >= first) {
                System.out.println(a + "  ");
            }

            int c = a + b;
            a = b;
            b = c;

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number = ");
        int first = sc.nextInt();

        System.out.println("Enter the second number = ");
        int last = sc.nextInt();

        System.out.println("----fibonacci series is ----");

        fibonacci_in_Range(first, last);

    }

}
