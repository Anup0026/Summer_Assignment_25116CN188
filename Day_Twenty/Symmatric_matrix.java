import java.util.Scanner;

public class Symmatric_matrix {

    public static void Symmatric_of_matrix(int[][] A, int[][] AT, int rows, int columns) {

        System.out.println("========= Transpose of the two given matrix is =========== ");

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                AT[j][i] = A[i][j];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {
                System.out.print(AT[i][j] + " ");

            }

            System.out.println();
        }

        boolean isSymmetric = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (A[i][j] != AT[i][j]) {
                    isSymmetric = false;
                    break;
                }
            }
        }

        if (isSymmetric) {
            System.out.println("Matrix is Symmetric.");
        } else {
            System.out.println("Matrix is NOT Symmetric.");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the order of the matrix :");
        int n = sc.nextInt();
        System.out.println("Enter the rows :");
        int rows = sc.nextInt();

        System.out.println("Enter the columns:");
        int columns = sc.nextInt();

        int[][] A = new int[rows][columns];
        int[][] AT = new int[rows][columns];

        System.out.println("================== Enter the matrix ===================");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                A[i][j] = sc.nextInt();

            }
        }

        Symmatric_of_matrix(A, AT, rows, columns);

    }
}
