import java.util.Scanner;

public class Voting_eligibility {

    public static void voting_eligibility_System(int age) {
        if (age <= 0) {
            System.out.println("Not possible");
        }

        else if (age >= 18) {

            System.out.println("Voter is Eligible for the Voting");

        } else {

            System.out.println("Voter is not Eligible for the Voting");
        }

        System.out.println("Thank you");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age of the Voter :");
        int age = sc.nextInt();

        voting_eligibility_System(age);

        sc.close();

    }

}
