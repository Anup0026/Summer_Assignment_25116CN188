import java.util.Scanner;

public class Sort_words_by_length {

    public static void Sort_words_by_length(String[] words) {

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1; j++) {

                if (words[j].length() > words[j + 1].length()) {

                    String temp = words[j];

                    words[j] = words[j + 1];

                    words[j + 1] = temp;

                }
            }

        }

        for (String word : words) {

            System.out.println(word + "  ");

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence : ");
        String sentence = sc.nextLine();

        String[] words = sentence.trim().split("\\s+");

        Sort_words_by_length(words);

        sc.close();

    }

}
