import java.util.Scanner;

public class printfactor_of_number {

    public static void print_factor_of_number(int n) {

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {

                System.out.println(i + "  ");

            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        System.out.println("===================== The factor of the given number " + (n) + " is ");

        print_factor_of_number(n);
    }

}
