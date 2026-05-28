
import java.util.Scanner;

public class Reverse_Of_given_number {

    static int sum_of_digit(int n) {

        int rev = 0;

        while (n > 0) {

            int digit = n % 10;

            rev = rev * 10 + digit;

            n = n / 10;

        }

        return rev;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        int result = sum_of_digit(n);

        System.out.println("The result is = " + result);

    }

}
