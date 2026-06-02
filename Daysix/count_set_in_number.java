import java.util.Scanner;

public class count_set_in_number {

    public static void count_set_in_number(int n) {
        int count = 0;

        while (n > 0) {

            for (int i = 1; i <= n; i++) {

                if (n % 2 == 1) {
                    count++;
                }

                n = n / 2;
            }
        }

        System.out.println("The total number of count set in a number = " + count);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        count_set_in_number(n);

    }

}
