
import java.util.Scanner;

public class Triangle_inverted_Pyramid {

    public static void Triangle_inverted_Pyramid(int n) {

        for (int i = 1; i <= n; i++) {
            for (int space = 0; space <= i; space++) {
                System.out.print("  ");
            }
            for (int j = 2 * (n - i) + 1; j >= 1; j--) {
                System.out.print("x ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        Triangle_inverted_Pyramid(n);
    }

}
