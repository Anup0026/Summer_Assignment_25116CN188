import java.util.Scanner;

public class Recursive_Reverse_of_the_number {

    public static int Reverse_of_number(int n) {

        if (n == 0) {

            return n;
        }
        System.out.print(n % 10);

        Reverse_of_number(n / 10);

        return n % 10;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        System.out.println("==================== Reverse of the given number ===================== ");

        Reverse_of_number(n);

    }
}
