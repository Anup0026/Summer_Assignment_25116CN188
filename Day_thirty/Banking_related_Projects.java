import java.util.Scanner;

public class Banking_related_Projects {

    static Scanner sc = new Scanner(System.in);

    static final int ACCOUNT_NUMBER = 4060;
    static final int PIN = 1234;

    static String accountHolder = "Anup";
    static double balance = 5000;

    static String transactionHistory = "No Transactions Yet.";

    public static void accountDetails() {
        System.out.println("\n==============================");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + ACCOUNT_NUMBER);
        System.out.println("==============================");
    }

    public static void checkBalance() {
        System.out.println("\nCurrent Balance : " + balance);
    }

    public static void depositMoney() {

        System.out.print("Enter Deposit Amount : ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance += amount;
            transactionHistory = "Deposited " + amount;
            System.out.println("Amount Deposited Successfully.");
            System.out.println("Updated Balance : " + balance);
        } else {
            System.out.println("Invalid Amount.");
        }
    }

    public static void withdrawMoney() {

        System.out.print("Enter Withdraw Amount : ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid Amount.");
        }

        else if (amount > balance) {
            System.out.println("Insufficient Balance.");
        }

        else {
            balance -= amount;
            transactionHistory = "Withdrawn " + amount;
            System.out.println("Please Collect Your Cash.");
            System.out.println("Remaining Balance : " + balance);
        }

    }

    public static void transferMoney() {

        System.out.print("Enter Receiver Account Number : ");
        int receiver = sc.nextInt();

        System.out.print("Enter Amount : ");
        double amount = sc.nextDouble();

        if (amount <= balance && amount > 0) {

            balance -= amount;

            transactionHistory = "Transferred " + amount +
                    " to Account " + receiver;

            System.out.println("Transfer Successful.");

            System.out.println("Remaining Balance : " + balance);

        } else {
            System.out.println("Transaction Failed.");
        }

    }

    public static void transactionHistory() {

        System.out.println("\n========== Transaction History ==========");
        System.out.println(transactionHistory);

    }

    public static void bankMenu() {

        int choice;

        do {

            System.out.println("\n========== BANK MENU ==========");
            System.out.println("1. Account Details");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Transfer Money");
            System.out.println("6. Transaction History");
            System.out.println("7. Exit");

            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    accountDetails();
                    break;

                case 2:
                    checkBalance();
                    break;

                case 3:
                    depositMoney();
                    break;

                case 4:
                    withdrawMoney();
                    break;

                case 5:
                    transferMoney();
                    break;

                case 6:
                    transactionHistory();
                    break;

                case 7:
                    System.out.println("\nThank You For Banking With Us.");
                    System.out.println("Have a Nice Day!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 7);

    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("      WELCOME TO TRUSTFUL BANK");
        System.out.println("========================================");

        System.out.print("Enter Account Number : ");
        int account = sc.nextInt();

        System.out.print("Enter PIN : ");
        int pin = sc.nextInt();

        if (account == ACCOUNT_NUMBER && pin == PIN) {

            System.out.println("\nLogin Successful.");
            bankMenu();

        } else {

            System.out.println("\nInvalid Account Number or PIN.");

        }

    }

}