
import java.util.Scanner;

public class Armstrong_number {

    public static void Armstrong_number(int n) {

        int sum = 0;
        int temp = n;

        while (temp > 0) {

            int digit = temp % 10;

            sum = sum + digit * digit * digit;

            temp = temp / 10;

        }

        if (sum == n) {

            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the  number = ");
        int n = sc.nextInt();

        Armstrong_number(n);

    }

}
