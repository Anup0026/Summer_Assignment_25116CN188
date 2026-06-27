
import java.util.Scanner;

public class QuizApplication {

    static int score = 0;

    public static void askQuestion(Scanner sc, String question, String op1, String op2, String op3, String op4,
            int answer) {

        System.out.println(question);
        System.out.println("1. " + op1);
        System.out.println("2. " + op2);
        System.out.println("3. " + op3);
        System.out.println("4. " + op4);

        System.out.print("Enter your answer: ");
        int choice = sc.nextInt();

        if (choice == answer) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Wrong!\n");
        }
    }

    public static void showResult() {
        System.out.println("Quiz Completed!");
        System.out.println("Your Score = " + score + "/4");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        askQuestion(sc,
                "1. what is the nick name of Rohit-Sharma ? ",
                "Hitman", "Cheeku", "Jaddu", "sky", 1);

        askQuestion(sc,
                "1. What is the capital of India?",
                "Delhi", "Mumbai", "Lucknow", "Chennai", 1);

        askQuestion(sc,
                "2. Which language is used for Android development?",
                "Python", "Java", "HTML", "C", 2);

        askQuestion(sc,
                "3. How many days are there in a week?",
                "5", "6", "7", "8", 3);

        showResult();

        sc.close();
    }
}
