import java.util.Scanner;

public class Marksheet_generation_System {

    public static void Marks_of_Students(int n, int[] arr, String[] name, float[] EVS, float[] ECE,
            float[] Engineering_Maths, float[] Engineering_Physics, float[] Engineering_Chemistry) {

        System.out.println("=============== Marksheet of the Student ===============");

        System.out.println("------------------------------------------------------");

        for (int i = 0; i < n; i++) {

            float total = EVS[i] + ECE[i] + Engineering_Maths[i] + Engineering_Chemistry[i] + Engineering_Physics[i];

            float average = total / 5.0f;

            System.out.println("Roll_no : " + arr[i]);
            System.out.println("Name : " + name[i]);

            System.out.println("Marks in Each Subjects are :");

            System.out.println("EVS : " + EVS[i]);
            System.out.println("ECE : " + ECE[i]);
            System.out.println("Engineering_Maths : " + Engineering_Maths[i]);
            System.out.println("Engineering_Physics : " + Engineering_Physics[i]);
            System.out.println("Engineering_Chemistry : " + Engineering_Chemistry[i]);

            System.out.println("Total_Marks(out of 500) : " + total);
            System.out.println("Percentage(%) " + average);

            System.out.println();

        }
        System.out.println("------------------------------------------------------");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of the candidates:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        String[] name = new String[n];

        float[] EVS = new float[n];
        float[] ECE = new float[n];
        float[] Engineering_Maths = new float[n];
        float[] Engineering_Physics = new float[n];
        float[] Engineering_Chemistry = new float[n];

        System.out.println(" ==================== Enter the Student Details ==============");

        for (int i = 0; i < n; i++) {

            System.out.println("Enter the roll no of " + (i + 1) + " Student : ");

            arr[i] = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the name of the candidate :");

            name[i] = sc.nextLine();

            System.out.println("Enter the marks of the Student in each Subjects(out of 100)");

            System.out.println("Enter the marks of the EVS: ");

            EVS[i] = sc.nextFloat();

            System.out.println("Enter the marks of the ECE: ");

            ECE[i] = sc.nextFloat();

            System.out.println("Enter the marks of the Engeeneering_Maths: ");

            Engineering_Maths[i] = sc.nextFloat();

            System.out.println("Enter the marks of the Engeeneering_Physics: ");

            Engineering_Physics[i] = sc.nextFloat();

            System.out.println("Enter the marks of the Engeeneering_Chemistry: ");

            Engineering_Chemistry[i] = sc.nextFloat();

            System.out.println();

        }

        Marks_of_Students(n, arr, name, EVS, ECE, Engineering_Maths, Engineering_Physics, Engineering_Chemistry);

    }

}
