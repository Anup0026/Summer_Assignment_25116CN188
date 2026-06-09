import java.util.Scanner;

public class Armstrong_number {

    public static void Armstrong_number(int n) {
        int sum = 0;

        while (n > 0) {

            int digit = n % 10;
            sum = sum + digit * digit * digit;
            n = n / 10;

        }

        System.out.println(sum);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        Armstrong_number(n);

    }

}
