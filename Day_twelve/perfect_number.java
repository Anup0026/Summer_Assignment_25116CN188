import java.util.Scanner;

public class perfect_number {
    public static void perfect_number(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {

                sum = sum + i;
            }
        }

        if (sum == n) {
            System.out.println("perfect_number");
        } else {

            System.out.println("Not perfect_number");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enteer the number = ");
        int n = sc.nextInt();

        perfect_number(n);

    }

}
