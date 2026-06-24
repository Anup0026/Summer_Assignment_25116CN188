import java.util.Scanner;
import java.util.Arrays;

public class Check_Anagram_String {

    static void checkAnagram(String s1, String s2) {
        char[] a = s1.toLowerCase().toCharArray();
        char[] b = s2.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b))
            System.out.println("Strings are Anagrams");
        else
            System.out.println("Strings are Not Anagrams");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String s1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String s2 = sc.nextLine();

        checkAnagram(s1, s2);
    }
}
