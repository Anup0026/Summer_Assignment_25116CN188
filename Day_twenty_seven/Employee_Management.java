import java.util.Scanner;

public class Employee_Management {

    public static void Employee_details(int n, int[] Employee_ID, String[] name, int[] age, String[] department,
            String[] designation, float[] Salary) {

        System.out.println(" =============== Employer  Details ===============\n");

        System.out.println("------------------------------------------------------");

        for (int i = 0; i < n; i++) {

            System.out.println("Employee_ID : " + Employee_ID[i]);
            System.out.println("Name : " + name[i]);
            System.out.println("Age : " + age[i]);
            System.out.println("Department : " + department[i]);
            System.out.println("Designation : " + designation[i]);

            System.out.println("Salary :" + Salary[i]);

            System.out.println();

        }

        System.out.println("------------------------------------------------------");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of Employee :");
        int n = sc.nextInt();

        String[] name = new String[n];

        int[] Employee_ID = new int[n];
        int[] age = new int[n];
        String[] department = new String[n];
        String[] designation = new String[n];

        float[] Salary = new float[n];

        System.out.println(" ==================== Enter the Employee Details ==============");

        for (int i = 0; i < n; i++) {

            System.out.println("Enter the Employee_ID of " + (i + 1) + " Employer : ");

            Employee_ID[i] = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the name of the Employer :");

            name[i] = sc.nextLine();

            System.out.println("Enter the Age of  Employer :");
            age[i] = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the Department name :");
            department[i] = sc.nextLine();

            System.out.println("Enter the designation of the Employer: ");
            designation[i] = sc.nextLine();

            System.out.println("Enter the Salary of the Employer :");
            Salary[i] = sc.nextFloat();

        }

        Employee_details(n, Employee_ID, name, age, department, designation, Salary);

    }
}
