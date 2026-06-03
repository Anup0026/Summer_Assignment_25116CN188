
import java.util.Scanner;

public class Recursive_sum_of_digits {

    public static int Sum_of_digits(int n) {

        if (n == 0 || n == 1) {

            return n;
        } else {

            return (n % 10) + Sum_of_digits(n / 10);

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        int result = Sum_of_digits(n);

        System.out.println("The result is  = " + result);

        sc.close();
    }

}
