import java.util.Scanner;

public class GCD_number {

    public static void GCD_number(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = b % a;
            a = temp;
        }

        System.out.println("The GCD of two number is = " + a);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the (a) = ");
        int a = sc.nextInt();
        System.out.println("Enter the second number (b) = ");
        int b = sc.nextInt();

        GCD_number(a, b);

    }

}
