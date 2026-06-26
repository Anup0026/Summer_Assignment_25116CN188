import java.util.Scanner;
import java.util.Arrays;

public class Sort_names_alphabetically {

    public static void Sorted_names(String[] name) {

        Arrays.sort(name);

        System.out.println("Sorted names are :");
        for (int i = 0; i < name.length; i++) {

            System.out.println(name[i]);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of the name :");
        int n = sc.nextInt();

        String[] name = new String[n];

        System.out.println("Enter the names:");

        for (int i = 0; i < name.length; i++) {
            name[i] = sc.nextLine();
        }

        Sorted_names(name);

        sc.close();
    }

}
