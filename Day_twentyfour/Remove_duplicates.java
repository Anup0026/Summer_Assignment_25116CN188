import java.util.Scanner;

import java.util.LinkedHashSet;

public class Remove_duplicates {

    public static void Remove_duplicate_String(String str) {

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char ch : str.toCharArray()) {

            set.add(ch);
        }
        StringBuilder result = new StringBuilder();
        for (char ch : set) {

            result.append(ch);
        }
        System.out.println("After Removing Duplicates: " + result);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name :");

        String str = sc.nextLine();

        Remove_duplicate_String(str);

        sc.close();
    }
}
