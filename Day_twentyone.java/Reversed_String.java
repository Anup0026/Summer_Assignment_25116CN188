import java.util.Scanner;

public class Reversed_String {

    public static void by_using_reversed_method(String name) {

        String reversed = new StringBuilder(name).reverse().toString();

        System.out.println(reversed);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name ");
        String name = sc.nextLine();

        by_using_reversed_method(name);

    }

}
