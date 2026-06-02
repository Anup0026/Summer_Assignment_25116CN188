
import java.util.Scanner;

public class x_to_thepower_n {

    public static void without_power_function(int n, int x) {
        int result = 1;

        for (int i = 1; i <= n; i++) {

            result = result * x;
        }

        System.out.println(x + " to the power " + n + " is = " + result);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of the  x =");
        int x = sc.nextInt();

        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        System.out.println("=============== The result is ==============\n");

        without_power_function(n, x);
        System.out.println("\n");
    }

}
