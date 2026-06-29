
import java.util.Scanner;

public class Bank_account_System {

    public static void Bank_Account_Management(int choice, Scanner sc, double[] Balance, int[] PIN, int userIndex) {

        switch (choice) {

            case 1:
                System.out.println("The Current Available Balance is : ₹" + Balance[userIndex]);
                break;

            case 2:
                System.out.print("Enter amount to deposit : ");
                double deposit = sc.nextDouble();

                if (deposit > 0) {
                    Balance[userIndex] += deposit;
                    System.out.println("₹" + deposit + " deposited successfully.");
                    System.out.println("Updated Balance : ₹" + Balance[userIndex]);
                } else {
                    System.out.println("Invalid Amount.");
                }
                break;

            case 3:
                System.out.print("Enter amount to withdraw : ");
                double withdraw = sc.nextDouble();

                if (withdraw <= Balance[userIndex] && withdraw > 0) {
                    Balance[userIndex] -= withdraw;
                    System.out.println("Please collect your cash.");
                    System.out.println("Remaining Balance : ₹" + Balance[userIndex]);
                } else {
                    System.out.println("Insufficient Balance or Invalid Amount.");
                }
                break;

            case 4:
                System.out.print("Enter Old PIN : ");
                int oldPin = sc.nextInt();

                if (oldPin == PIN[userIndex]) {
                    System.out.print("Enter New PIN : ");
                    int newPin = sc.nextInt();

                    System.out.print("Confirm New PIN : ");
                    int confirmPin = sc.nextInt();

                    if (newPin == confirmPin) {
                        PIN[userIndex] = newPin;
                        System.out.println("PIN changed successfully.");
                    } else {
                        System.out.println("PIN does not match.");
                    }
                } else {
                    System.out.println("Incorrect Old PIN.");
                }
                break;

            case 5:
                System.out.println("Thank you for using this Trustful ATM.");
                break;

            default:
                System.out.println("EXIT/Invalid choice");
        }
    }

    public static void Bank_details(int n, double[] Account_Number, String[] Account_holder_name, double[] Balance) {
        System.out.println("\n =============== Bank Related Details ===============\n");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.println("Account Number : " + Account_Number[i]);
            System.out.println("Account Holder Name : " + Account_holder_name[i]);
            System.out.println("Balance : ₹" + Balance[i]);
            System.out.println();
        }

        System.out.println("------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of Users :");
        int n = sc.nextInt();

        double[] Account_Number = new double[n];
        String[] Account_holder_name = new String[n];
        double[] Balance = new double[n];
        int[] PIN = new int[n];

        System.out.println("\n ==================== Enter the User Details in Bank ==============");

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Account Number of User " + (i + 1) + " : ");
            Account_Number[i] = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter the Account Holder Name :");
            Account_holder_name[i] = sc.nextLine();

            System.out.println("Enter the Balance :");
            Balance[i] = sc.nextDouble();

            System.out.println("Set a PIN for this account :");
            PIN[i] = sc.nextInt();
            sc.nextLine();

            System.out.println();
        }

        System.out.print("Enter your Account Number: ");
        double acc = sc.nextDouble();
        System.out.print("Enter your PIN: ");
        int pin = sc.nextInt();

        int userIndex = -1;
        for (int i = 0; i < n; i++) {
            if (Account_Number[i] == acc && PIN[i] == pin) {
                userIndex = i;
                break;
            }
        }

        if (userIndex != -1) {
            System.out.println("\n========== Bank Managment System ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Change PIN");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");

            int choice = sc.nextInt();
            Bank_Account_Management(choice, sc, Balance, PIN, userIndex);

        } else {
            System.out.println("Invalid Account Number or PIN. Try Again/Exit.");
        }

        Bank_details(n, Account_Number, Account_holder_name, Balance);
    }
}
