//19.Write a program to Implement matrix multiplication.

public class EX19
{
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] B = A(matrix1, matrix2);

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);

        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);

        System.out.println("\nResultant matrix after multiplication:");
        displayMatrix(B);
    }

    public static int[][] A(int[][] matrix1, int[][] matrix2) {
        int[][] B = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    B[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return B;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
