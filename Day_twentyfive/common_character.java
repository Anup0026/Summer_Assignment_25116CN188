import java.util.Scanner;

public class common_character {

    public static void common_character(String str1, String str2) {

        for (int i = 0; i < str1.length(); i++) {

            char ch = str1.charAt(i);

            for (int j = 0; j < str2.length(); j++) {
                if (ch == str2.charAt(j)) {

                    System.out.println(ch + "  ");

                    break;
                }
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first name :");
        String str1 = sc.nextLine();

        System.out.println("Enter the Second name :");
        String str2 = sc.nextLine();

        System.out.println("The common character in both name is :");

        common_character(str1, str2);

        sc.close();
    }

}
