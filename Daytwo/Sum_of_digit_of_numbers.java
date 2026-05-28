import java.util.Scanner;

public class Sum_of_digit_of_numbers {

    static int sum_of_digit(int n) {

        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            sum = sum + digit;
            n = n / 10;

        }

        return sum;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        int result = sum_of_digit(n);

        System.out.println("The result is = " + result);

    }

}
