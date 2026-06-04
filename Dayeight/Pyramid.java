import java.util.Scanner;

public class Pyramid {

    public static void Pyramid(int n) {
        for (int i = 1; i <= n; i++) {

            for (int space = 1; space <= n - i; space++) {

                System.out.print("   ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {

                System.out.print(" * ");
            }
            System.out.print("\n");

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        System.out.println("The Pyramid is ");
        Pyramid(n);

    }

}
