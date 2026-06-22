import java.util.Scanner;

public class Addition_of_matrix {

    public static void Addition_of_matrix(int[][] A, int[][] B, int[][] C, int rows, int columns) {

        System.out.println("========= The additon of the two given matrix is =========== ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                C[i][j] = A[i][j] + B[i][j];

                System.out.print(C[i][j] + " ");

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
        int[][] C = new int[rows][columns];

        System.out.println("================== First matrix input ===================");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                A[i][j] = sc.nextInt();

            }
        }

        System.out.println("================== Second matrix input ===================");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                B[i][j] = sc.nextInt();

            }
        }

        Addition_of_matrix(A, B, C, rows, columns);

    }

}
