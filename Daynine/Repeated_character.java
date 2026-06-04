
import java.util.Scanner;

public class Repeated_character {

    public static void digit_Triangle(int n) {
        for (int i = 65; i <= 64 + n; i++) {
            for (int j = 65; j <= i; j++) {
                System.out.printf("%c", i);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        digit_Triangle(n);

    }
}
