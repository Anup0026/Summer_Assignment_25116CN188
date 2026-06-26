import java.util.Scanner;

public class Compress_string {

    public static void Compress_string(String name, int n) {

        for (int i = 0; i < n; i++) {

            char ch = name.charAt(i);

            int count = 0;

            while (i < n && name.charAt(i) == ch) {
                i++;
                count++;

            }
            i--;
            System.out.print(ch);
            System.out.print(count);

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String name = sc.nextLine();

        Compress_string(name, name.length());

        sc.close();

    }

}
