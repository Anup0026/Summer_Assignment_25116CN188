import java.util.Scanner;

public class Menu_driven_Calculator {

    static void calculater(int choice, double a, double b) {
        switch (choice) {

            case 1:
                System.out.println("The result is = " + (a + b));
                break;

            case 2:
                if (a < b) {
                    System.out.println("The result is =  " + ((a - b)));

                } else {
                    System.out.println("The result is = " + (a - b));
                    break;
                }

            case 3:
                System.out.println("The result is = " + (a * b));
                break;

            case 4:
                if (b != 0)
                    System.out.println("The result is = " + (a / b));
                else
                    System.out.println("The number can not be divide ");
                break;

            case 5:
                System.out.println("The result  is = " + (a % b));
                break;

            case 6:
                System.out.println("The result is = " + Math.sqrt(a));
                break;

            case 7:
                System.out.println("The result is = " + Math.sqrt(b));
                break;

            case 8:
                System.out.println("The result is = " + Math.cbrt(a));
                break;

            case 9:
                System.out.println("The result is = " + Math.cbrt(b));
                break;

            case 10:
                System.out.println("The result is = " + Math.max(a, b));
                break;

            case 11:
                System.out.println("The result is = " + Math.min(a, b));
                break;

            case 12:
                System.out.println("The result is = " + Math.exp(a));
                break;

            case 13:
                System.out.println("The result is = " + Math.exp(b));
                break;

            case 14:
                System.out.println("The result is = " + Math.log10(a));
                break;

            case 15:
                System.out.println("The result is = " + Math.log10(b));
                break;
            case 16:
                System.out.println("The result is = " + Math.pow(a, b));
                break;

            default:
                System.out.println("User enter wrong case ");

        }
    }

    public static void main(String[] args) {

        System.out.println("============ Welcome in complex calculater ============");

        System.out.println("============ Choice of Toppers ============");

        System.out.println("Enter 1 for sum of the numbers(a+b)");
        System.out.println("Enter 2 for subtract of the numbers(a-b)");
        System.out.println("Enter 3 for multiply of the numbers(a*b)");
        System.out.println("Enter 4 for divison from second numbers to the first number(a/b)");
        System.out.println("Enter 5 for remainder of the numbers if first number is divided by second number");
        System.out.println("Enter 6 for squareroot of the first numbers(a)");
        System.out.println("Enter 7 for squareroot of the Second numbers(b)");
        System.out.println("Enter 8 for cuberoot of the first numbers(a)");
        System.out.println("Enter 9 for cuberoot of the Second numbers(b))");
        System.out.println("Enter 10 for maximum between these two numbers");
        System.out.println("Enter 11 for minimum between of these two numbers");
        System.out.println("Enter 12 for value of exponential power of first number a");
        System.out.println("Enter 13 for value of exponential power of second number b");
        System.out.println("Enter 14 for lograthmic vlaue of firstnumber(a)to base 10 ");
        System.out.println("Enter 15 for lograthmic vlaue of Secondnumber(b) to base 10 ");
        System.out.println("Enter 16 for value of(a^b) = ");

        System.out.println("Enter the choice = ");
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        System.out.println("Enter the first number = ");
        double x = sc.nextDouble();

        System.out.println("Enter the second number = ");
        double y = sc.nextDouble();

        calculater(choice, x, y);

    }
}
