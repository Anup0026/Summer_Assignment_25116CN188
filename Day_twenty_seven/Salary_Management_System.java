import java.util.Scanner;

public class Salary_Management_System {

    public static void displaySalary(int n, int[] empId, String[] name, float[] basic, float[] hra, float[] da,
            float[] bonus, float[] pf, float[] tax) {

        System.out.println("\n============= EMPLOYEE SALARY DETAILS =============");

        for (int i = 0; i < n; i++) {

            float grossSalary = basic[i] + hra[i] + da[i] + bonus[i];
            float netSalary = grossSalary - (pf[i] + tax[i]);

            System.out.println("--------------------------------------------");
            System.out.println("Employee ID   : " + empId[i]);
            System.out.println("Employee Name : " + name[i]);
            System.out.println("Basic Salary  : " + basic[i]);
            System.out.println("HRA           : " + hra[i]);
            System.out.println("DA            : " + da[i]);
            System.out.println("Bonus         : " + bonus[i]);
            System.out.println("PF Deduction  : " + pf[i]);
            System.out.println("Tax Deduction : " + tax[i]);
            System.out.println("Gross Salary  : " + grossSalary);
            System.out.println("Net Salary    : " + netSalary);
            System.out.println("--------------------------------------------");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        int[] empId = new int[n];
        String[] name = new String[n];
        float[] basic = new float[n];
        float[] hra = new float[n];
        float[] da = new float[n];
        float[] bonus = new float[n];
        float[] pf = new float[n];
        float[] tax = new float[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter Details of Employee " + (i + 1));

            System.out.print("Employee ID: ");
            empId[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Employee Name: ");
            name[i] = sc.nextLine();

            System.out.print("Basic Salary: ");
            basic[i] = sc.nextFloat();

            System.out.print("HRA: ");
            hra[i] = sc.nextFloat();

            System.out.print("DA: ");
            da[i] = sc.nextFloat();

            System.out.print("Bonus: ");
            bonus[i] = sc.nextFloat();

            System.out.print("PF Deduction: ");
            pf[i] = sc.nextFloat();

            System.out.print("Tax Deduction: ");
            tax[i] = sc.nextFloat();
        }

        displaySalary(n, empId, name, basic, hra, da, bonus, pf, tax);

        sc.close();
    }
}
