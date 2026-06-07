import java.util.Scanner;

public class Factorial_number {

    public static void Factorial_number(int n) {

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("The factorial of the given_number " + n + " is =  " + fact);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        Factorial_number(n);

    }
}
