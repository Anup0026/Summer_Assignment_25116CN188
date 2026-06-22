import java.util.Scanner;

public class Transpose_ {

    public static void Transpose_of_matrix(int[][] A, int[][] B, int rows, int columns) {

        System.out.println("========= Transpose of the two given matrix is =========== ");

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                B[j][i] = A[i][j];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {
                System.out.print(B[i][j] + " ");

            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows :");
        int rows = sc.nextInt();

        System.out.println("Enter the columns:");
        int columns = sc.nextInt();

        int[][] A = new int[rows][columns];
        int[][] B = new int[rows][columns];

        System.out.println("================== Enter the matrix ===================");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                A[i][j] = sc.nextInt();

            }
        }

        Transpose_of_matrix(A, B, rows, columns);

    }

}
