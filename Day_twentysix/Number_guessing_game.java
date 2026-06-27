import java.util.Scanner;
import java.util.Random;

public class Number_guessing_game {

    public static int generateNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public static void playGame(Scanner sc, int number) {

        int guess;

        do {
            System.out.print("Guess the number (1-100): ");
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("user guess highest number then requirement");
            } else if (guess < number) {
                System.out.println("user guess less number then requirement");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
            }

        } while (guess != number);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = generateNumber();

        playGame(sc, number);

        sc.close();
    }
}
