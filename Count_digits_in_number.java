
import java.util.Scanner;

public class Count_digits_in_number {

    static int countdigit(int n) {

        int count = 0;

        while (n > 0) {

            n = n / 10;

            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");

        int n = sc.nextInt();

        int result = countdigit(n);

        System.out.println("The number of digit in number is  = " + result);

    }
}
