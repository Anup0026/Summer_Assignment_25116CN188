
import java.util.Scanner;

public class LCM_of_two__number {

    public static void LCM_of_two_number(int a, int b) {
        int x = a;
        int y = b;

        // Here we are storing the number in the x and y because we will work on the the copy
        // copy of the number because actual value will remain same

        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;

        }

        System.out.println("The GCD of these two  number is = " + x);

        int LCM = (a * b) / x;
        System.out.println("The LCM of these two number is " + LCM);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number(a) =  ");
        int a = sc.nextInt();

        System.out.println("Enter the second number(b) = ");
        int b = sc.nextInt();

        LCM_of_two_number(a, b);

    }

}
