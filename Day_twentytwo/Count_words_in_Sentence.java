import java.util.Scanner;

public class Count_words_in_Sentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();

        int words = 1;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                words++;
            }
        }

        System.out.println("Total Words = " + words);

        sc.close();
    }
}
