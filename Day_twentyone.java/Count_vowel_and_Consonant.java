import java.util.Scanner;

public class Count_vowel_and_Consonant {

    public static void Count_vowel_and_Consonant(String name) {

        int vowel_count = 0;
        int Consonant_count = 0;

        for (int i = 0; i < name.length(); i++) {

            char ch = Character.toLowerCase(name.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowel_count++;
            else
                Consonant_count++;
        }

        System.out.println("Vowels: " + vowel_count);
        System.out.println("Consonants: " + Consonant_count);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name = ");
        String name = sc.nextLine();

        Count_vowel_and_Consonant(name);

    }

}
