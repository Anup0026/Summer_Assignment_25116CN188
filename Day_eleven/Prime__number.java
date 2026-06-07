import java.util.Scanner;

public class Prime__number {

    public static void Prime__number(int n) {
        boolean prime = true;
        if (n <= 1) {
            prime = false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {

                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println("Prime_number");
        } else {
            System.out.println("Not prime_number");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        Prime__number(n);

    }

}
