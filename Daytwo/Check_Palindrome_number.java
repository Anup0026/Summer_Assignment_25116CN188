import java.util.Scanner;

public class Check_Palindrome_number {

    static void palindrome_number(int n) {

        int originalnumber = n;
        int rev = 0;

        while (n > 0) {

            int digit = n % 10;

            rev = rev * 10 + digit;

            n = n / 10;

        }

        if (originalnumber == rev) {
            System.out.println("User entered a palindrome number");

        } else {
            System.out.println("User does not enter palaindrome number");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        palindrome_number(n);

    }

}
