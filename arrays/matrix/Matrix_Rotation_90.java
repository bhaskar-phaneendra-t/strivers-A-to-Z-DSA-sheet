package matrix;

import java.util.*;

public class Matrix_Rotation_90 {

    public static void transpose(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) {
                if (i != j) {
                    // Swap matrix[i][j] and matrix[j][i]
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
    }

    public static void reverseRows(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            int left = 0, right = cols - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the matrix size: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        transpose(matrix, rows, cols);
        reverseRows(matrix, rows, cols);

        System.out.println("Rotated matrix (90 degrees clockwise):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }

        sc.close();
    }
}
