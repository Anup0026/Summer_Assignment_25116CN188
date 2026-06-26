import java.util.Scanner;

public class Check_rotation {

    public static boolean check_rotation(String first, String second) {

        if (first.length() != second.length()) {

            System.out.println("Rotation of the element is not possible");

            return false;

        }

        String temp = first + second;

        System.out.println("yes,Rotation of all the character is possible");

        return temp.contains(second);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first name :");
        String first = sc.nextLine();
        System.out.println("Enter the second name ");
        String second = sc.nextLine();

        check_rotation(first, second);

    }

}
