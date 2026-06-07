import java.util.Scanner;

public class Sum_of_two_no_by_function {

    public static int Sum_of_two_no_by_function(int x, int y) {

        int result = x + y;

        System.out.println("The sum of entered two number is = " + result);
        return x + y;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of the x = ");
        int x = sc.nextInt();

        System.out.println("Enter the value of the y =");
        int y = sc.nextInt();

        Sum_of_two_no_by_function(x, y);

    }
}