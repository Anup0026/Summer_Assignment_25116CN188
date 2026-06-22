import java.util.Scanner;

public class Sum_of_rows {

    public static void Sum_of_rows(int[][] matrix, int n) {

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {

                sum += matrix[i][j];

            }

            System.out.print("sum of the " + (i + 1) + " row : " + sum);

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the order of the matrix :");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the element in the matrix :");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                matrix[i][j] = sc.nextInt();

            }
        }

        Sum_of_rows(matrix, n);

    }

}
