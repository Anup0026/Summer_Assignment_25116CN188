import java.util.Scanner;

public class Palindrome_number {

    public static void Palindrome_number(int n) {

        int temp = n;
        int rev = 0;

        while (n > 0) {

            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;

        }

        if (rev == temp) {

            System.out.println("Given number " + temp + "  is the Palindrome number");
        } else {

            System.out.println("Given  number " + temp + " is not the Palindrome number ");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        Palindrome_number(n);

    }

}
