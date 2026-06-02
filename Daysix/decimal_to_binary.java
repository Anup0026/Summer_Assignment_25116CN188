import java.util.Scanner;

public class decimal_to_binary {

    public static void decimal_to_binary(int n) {

        int binary = 0;
        int place = 1;

        while (n > 0) {

            int digit = n % 2;
            binary = binary + digit * place;
            place = place * 10;

            n = n / 2;

        }

        System.out.println("The result is = " + binary);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");

        int n = sc.nextInt();

        decimal_to_binary(n);

    }

}
