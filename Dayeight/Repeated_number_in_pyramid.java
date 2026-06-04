import java.util.Scanner;

public class Repeated_number_in_pyramid {

    public static void Repeated_number_in_pyramid(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(i);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n = sc.nextInt();

        System.out.println("============== Repeated Pyramid is ============");

        Repeated_number_in_pyramid(n);

    }

}
