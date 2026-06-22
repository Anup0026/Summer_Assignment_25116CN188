import java.util.Scanner;

public class String_length {
    public static void Length_of_String_without_Strln(String name) {

        System.out.print("The length of the String is = ");

        System.out.print(name.toCharArray().length);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name : ");
        String name = sc.nextLine();

        Length_of_String_without_Strln(name);
    }

}
