
import java.util.Scanner;

public class Product_of_digits {

    static int multiply_of_digit(int n) {

        int mul = 1;

        while (n > 0) {

            int digit = n % 10;

            mul = mul * digit;

            n = n / 10;

        }

        return mul;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        int result = multiply_of_digit(n);

        System.out.println("The result is = " + result);

    }
}
