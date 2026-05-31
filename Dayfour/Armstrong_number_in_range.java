
import java.util.Scanner;

public class Armstrong_number_in_range {

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

        System.out.println("Enter the first number = ");
        int a = sc.nextInt();
        System.out.println("Enter the last number =");
        int b = sc.nextInt();

        // this is use for the giving the range to print Armstrong number or not

        for (int i = a; i <= b; i++) {
            System.out.print("The number " + i + " is ");
            Armstrong_number(i);
        }

    }

}
