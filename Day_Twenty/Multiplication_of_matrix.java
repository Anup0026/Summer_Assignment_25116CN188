import java.util.Scanner;

public class Multiplication_of_matrix {

    public static void Multiplication_of_matrix(int[][] A, int[][] B, int[][] C, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {

                    C[i][j] += A[i][k] * B[k][j];

                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(C[i][j] + " ");

            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the order of the matrix : ");
        int n = sc.nextInt();

        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] C = new int[n][n];// used for the multiplication

        System.out.println("Enter the elements in the first matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                A[i][j] = sc.nextInt();

            }
        }

        System.out.println("Enter the elements in the Second matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                B[i][j] = sc.nextInt();

            }
        }

        Multiplication_of_matrix(A, B, C, n);

    }

}
