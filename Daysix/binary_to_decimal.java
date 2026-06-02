import java.util.Scanner;

public class binary_to_decimal {

    public static void binary_to_decimal(int n) {

        int decimal = 0;
        int power = 0;
        while (n > 0) {

            int digit = n % 10;
            decimal = decimal + digit * (int) Math.pow(2, power);
            power++;

            n = n / 10;

        }

        System.out.println("Decimal number = " + decimal);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entert the binary number = ");
        int n = sc.nextInt();
        binary_to_decimal(n);
    }

}
