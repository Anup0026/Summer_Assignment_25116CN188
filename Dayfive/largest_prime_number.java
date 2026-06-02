
import java.util.Scanner;

public class largest_prime_number {

    public static void largest_prime_number(int n) {

        int largest = -1;
        for (int i = 2; i <= n; i++) {

            if (n % i == 0) {

                largest = i;
                n = n / i;
            }
        }

        System.out.println("The largest prime_factor is = " + largest);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        largest_prime_number(n);

    }

}
