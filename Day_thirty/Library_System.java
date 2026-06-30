import java.util.Scanner;

public class Library_System {

    public static void Book_details(int n, int[] Book_ID, String[] Book_name, int[] Book_price,
            String[] Book_author_name,
            String[] Book_Status, String[] Student_name) {

        System.out.println(" =============== Library Management System ===============\n");

        System.out.println("------------------------------------------------------");

        System.out.println(" === Book Details ===");

        for (int i = 0; i < n; i++) {

            System.out.println("Book_ID : " + Book_ID[i]);
            System.out.println("Book_name : " + Book_name[i]);
            System.out.println("Book_price : " + Book_price[i]);
            System.out.println("Book_author_name : " + Book_author_name[i]);
            System.out.println("Book_Status : " + Book_Status[i]);
            System.out.println("Studen_name : " + Student_name);

            System.out.println();

        }

        System.out.println("------------------------------------------------------");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of Student :");
        int n = sc.nextInt();

        int[] Book_ID = new int[n];

        String[] Book_name = new String[n];
        int[] Book_price = new int[n];
        String[] Book_author_name = new String[n];
        String[] Book_Status = new String[n];
        String[] Student_name = new String[n];

        System.out.println(" ==================== Enter the Book Details ==============");

        for (int i = 0; i < n; i++) {

            System.out.println("Enter the Book_ID of " + (i + 1) + " Student : ");

            Book_ID[i] = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the name of the Book :");

            Book_name[i] = sc.nextLine();

            System.out.println("Enter the Price of the Book :");
            Book_price[i] = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the Book author name :");
            Book_author_name[i] = sc.nextLine();

            System.out.println("Enter the  Book_Status(currently) : ");
            Book_Status[i] = sc.nextLine();

            System.out.println("Book is issued for Student : ");
            Student_name[i] = sc.nextLine();

            System.out.println();

        }

        Book_details(n, Book_ID, Book_name, Book_price, Book_author_name, Book_Status, Student_name);

    }
}
