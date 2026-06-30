import java.util.Scanner;

public class String_operations {

    public static void Display_name(String[] name, int n) {

        System.out.println("-----------------------------------------");

        System.out.println("There is the name of the Person");
        for (int i = 0; i < n; i++) {

            System.out.println(+(i + 1) + " Name : " + name[i]);
        }
        System.out.println();

    }

    public static void Convert_in_Uppercase(Scanner sc, int n, String[] lower_case) {

        for (int i = 0; i < n; i++) {

            System.out.println("Enter the " + (i + 1) + " String in the Lowercase:");
            lower_case[i] = sc.nextLine();

        }

        System.out.println("Elements are in the Uppercase :");

        for (int i = 0; i < n; i++) {

            System.out.println("Uppercase: " + lower_case[i].toUpperCase());

        }

        System.out.println();

    }

    public static void Convert_in_Lowercase(Scanner sc, int n, String[] Upper_case) {

        for (int i = 0; i < n; i++) {

            System.out.println("Enter the " + (i + 1) + " String in the Uppercase:");
            Upper_case[i] = sc.nextLine();

        }

        System.out.println("Elements are in the Lowercase :");

        for (int i = 0; i < n; i++) {

            System.out.println("Lowercase: " + Upper_case[i].toLowerCase());

        }

        System.out.println();

    }

    public static void Reverse_String(Scanner sc) {

        System.out.println("Enter the String which will become reverse : ");
        String name = sc.nextLine();

        StringBuilder sb = new StringBuilder(name);
        String reversed = sb.reverse().toString();

        System.out.println("Reversed String: " + reversed);
        System.out.println();

        System.out.println("-----------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total number of the person :");
        int n = sc.nextInt();
        sc.nextLine();

        String[] name = new String[n];
        String[] Upper_case = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.print(+(i + 1) + " Name : ");
            name[i] = sc.nextLine();

        }

        Display_name(name, n);
        Convert_in_Uppercase(sc, n, Upper_case);
        Convert_in_Lowercase(sc, n, Upper_case);
        Reverse_String(sc);
    }

}
