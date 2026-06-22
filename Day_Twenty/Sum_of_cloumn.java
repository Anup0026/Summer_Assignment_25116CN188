import java.util.Scanner;

public class Sum_of_cloumn {

    public static void Sum_of_Column(int[][] matrix, int n) {

        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {

                sum += matrix[i][j];

            }

            System.out.print("sum of the " + (j + 1) + " Column : " + sum);

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

        Sum_of_Column(matrix, n);

    }

}
