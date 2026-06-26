import java.util.Scanner;

public class Largest_word {

    public static void Largest_word(String[] name, int n) {

        String longest = name[0];

        for (int i = 0; i < name.length; i++) {

            if (name[i].length() > longest.length()) {

                longest = name[i];

            }
        }

        System.out.print("Longest name or word : " + longest);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of name :");
        int n = sc.nextInt();
        sc.nextLine();

        String[] name = new String[n];

        System.out.println("Enter the name :");
        for (int i = 0; i < name.length; i++) {
            name[i] = sc.nextLine();

        }

        Largest_word(name, n);

    }
}
