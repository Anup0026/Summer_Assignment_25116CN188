import java.util.Scanner;

public class Student_record_Management {

    public static void Student_details(int n, int[] arr, String[] name, float[] marks) {

        System.out.println(" =============== Student Details ===============\n");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < n; i++) {

            System.out.println("Roll_no : " + arr[i]);
            System.out.println("Name : " + name[i]);

            System.out.println("Marks :" + marks[i]);

            System.out.println();

        }
        System.out.println("------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of the student in the college :");
        int n = sc.nextInt();

        String[] name = new String[n];

        int[] arr = new int[n];
        float[] marks = new float[n];

        System.out.println(" ==================== Enter the Student Details ==============");

        for (int i = 0; i < n; i++) {

            System.out.println("Enter the roll no of " + (i + 1) + " Student : ");

            arr[i] = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the name of the candidate :");

            name[i] = sc.nextLine();

            System.out.println("Enter the marks of the Student :");
            marks[i] = sc.nextFloat();

        }

        Student_details(n, arr, name, marks);

    }

}
