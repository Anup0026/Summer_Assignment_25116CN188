import java.util.Scanner;

public class diagonal_sum_in_matrix {

    public static void Diagonal_sum(int[][] matrix, int n) {

        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum += matrix[i][i];

        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of the matrix :");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the element of the matirx :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }

        Diagonal_sum(matrix, n);

    }

}
