import java.util.Scanner;

public class Find_first_repeating_character {

    static void findRepeating(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println("First Repeating Character: " + str.charAt(i));
                    return;
                }
            }
        }

        System.out.println("No Repeating Character Found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        findRepeating(str);
    }
}
