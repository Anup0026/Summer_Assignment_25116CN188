
import java.util.Scanner;

public class Sum_of_Natural_number {

    static int sum_of_natural_numbers(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number  = ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("User enter the negative number ");
        } else {

            int result = sum_of_natural_numbers(n);

            System.out.println("The sum of natural number till entered number = " + result);
        }

    }

}
