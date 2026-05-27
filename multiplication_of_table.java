
import java.util.Scanner;

public class multiplication_of_table {

    static int multiplication_table_of_a_number(int n) {

        int mul = 1;

        for (int i = 1; i <= 10; i++) {
            mul = n * i;
            System.out.printf("%d *  %d =  %d ", n, i, mul);

            System.out.print("\n");
        }

        return mul;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number which table is to be required = ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("User enter the wrong number ");
        } else {
            multiplication_table_of_a_number(n);
        }

    }
}
