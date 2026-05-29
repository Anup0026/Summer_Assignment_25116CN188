
import java.util.Scanner;

public class Prime_number {

    public static void Prime_number(int n) {

        boolean prime = true;

        if (n <= 1) {

            prime = false;

        } else {

            for (int i = 2; i <= n / 2; i++) {

                if (n % i == 0) {

                    prime = false;

                    break;
                }

            }
        }

        if (prime) {

            System.out.println("Entered number is the prime number");
        } else {

            System.out.println("Entered number is not the prime number");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        Prime_number(n);

    }

}
