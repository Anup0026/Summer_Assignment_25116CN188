import java.util.Scanner;

public class Digit_triangle_Pyramid {

    public static void Digit_triangle_Pyramid(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the  number = ");
        int n = sc.nextInt();

        System.out.println("The Right_angle_Pyramid_is ");
        Digit_triangle_Pyramid(n);

    }

}
