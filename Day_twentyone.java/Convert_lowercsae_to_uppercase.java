import java.util.Scanner;

public class Convert_lowercsae_to_uppercase {

    public static void Convert_into_uppercase(String name) {

        System.out.println("Here lower case is converted into the upper case character:");
        String Ch = name.toUpperCase();

        System.out.println(Ch);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("User will enter the name in to the lower case");
        String name = sc.nextLine();

        Convert_into_uppercase(name);

    }

}
