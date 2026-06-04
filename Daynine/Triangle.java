
import java.util.Scanner;

public class Triangle {
    public static void Triangle(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("x");
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
