
import java.util.Scanner;

public class Prime_number_in_Range {

    public static void Prime_number_in_Range(int a, int b) {

        int i, j;

        boolean prime;

        for (i = a; i <= b; i++) {

            prime = true;

            if (i <= 1) {
                prime = false;
            } else {

                for (j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }

            }

            if (prime) {
                System.out.println(i + "  ");
            }

        } // above loop is terinated

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number  = ");
        int a = sc.nextInt();

        System.out.println("Enter the Second number = ");
        int b = sc.nextInt();

        Prime_number_in_Range(a, b);

    }
}
