import java.util.Scanner;

public class Find_first_non_repeating_character {

    static void findNonRepeating(String str) {
        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("First Non-Repeating Character: " + str.charAt(i));
                return;
            }
        }

        System.out.println("No Non-Repeating Character Found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        findNonRepeating(str);
    }
}
