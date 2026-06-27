import java.util.Scanner;

public class ATM_Simulation {

    static Scanner sc = new Scanner(System.in);

    static int pin = 4060;
    static double balance = 5000;

    public static void ATM(int choice) {

        switch (choice) {

            case 1:
                System.out.println("The Current Available balance is : ₹" + balance);
                break;

            case 2:
                System.out.print("Enter amount to deposit : ");
                double deposit = sc.nextDouble();

                if (deposit > 0) {
                    balance = balance + deposit;
                    System.out.println("₹" + deposit + " deposited successfully.");
                    System.out.println("Updated Balance : ₹" + balance);
                } else {
                    System.out.println("Invalid Amount.");
                }
                break;

            case 3:
                System.out.print("Enter amount to withdraw : ");
                double withdraw = sc.nextDouble();

                if (withdraw <= balance && withdraw > 0) {
                    balance = balance - withdraw;
                    System.out.println("Please collect your cash.");
                    System.out.println("Remaining Balance : ₹" + balance);
                } else {
                    System.out.println("Insufficient Balance or Invalid Amount.");
                }
                break;

            case 4:
                System.out.print("Enter Old PIN : ");
                int oldPin = sc.nextInt();

                if (oldPin == pin) {

                    System.out.print("Enter New PIN : ");
                    int newPin = sc.nextInt();

                    System.out.print("Confirm New PIN : ");
                    int confirmPin = sc.nextInt();

                    if (newPin == confirmPin) {
                        pin = newPin;
                        System.out.println("PIN changed successfully.");
                    } else {
                        System.out.println("PIN does not match.");
                    }

                } else {
                    System.out.println("Incorrect Old PIN.");
                }
                break;

            case 5:
                System.out.println("Thank you ");
                System.out.println("for using this Trustful  ATM ");
                break;

            default:
                System.out.println("EXIT/Invalid choice");

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========= ATM has been Started ==========");

        System.out.println("============ Welcome ============");
        System.out.println("Enter the pin of the atm:");
        int enteredpin = sc.nextInt();

        if (enteredpin == pin) {
            System.out.println("\n========== ATM MENU ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Change PIN");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");

            int choice = sc.nextInt();

            ATM(choice);

        } else {

            System.out.println("User entered the wrong pin");
            System.out.println("Invalid PIN");
            System.out.println("Try Again/Exit");
        }

    }

}
