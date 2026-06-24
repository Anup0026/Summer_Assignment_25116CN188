import java.util.Scanner;

public class Maximum_occuring_ch {

    static void findMaxChar(String str) {
        char maxChar = ' ';
        int maxCount = 0;

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = str.charAt(i);
            }
        }

        System.out.println("Maximum Occurring Character: " + maxChar);
        System.out.println("Frequency: " + maxCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        findMaxChar(str);
    }
}
