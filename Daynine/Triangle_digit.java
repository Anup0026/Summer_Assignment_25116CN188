
import java.util.Scanner;

public class Triangle_digit {
    public static void Triangle(int n) {

        for (int j = n; j >= 1; j--) {

            for (int k = 1; k <= j; k++) {
                System.out.print(k);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        Triangle(n);

    }
}
