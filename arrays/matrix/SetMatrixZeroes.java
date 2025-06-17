package matrix;

import java.util.*;

public class SetMatrixZeroes {

    public static void making0(int[][] matrix, int no_row, int no_col) {
        boolean colZero = true;

        
        for (int i = 0; i < no_row; i++) {
            if (matrix[i][0] == 0) {
                colZero = false;
            }
            for (int j = 1; j < no_col; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < no_row; i++) {
            for (int j = 1; j < no_col; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int j = 0; j < no_col; j++) {
                matrix[0][j] = 0;
            }
        }
        if (!colZero) {
            for (int i = 0; i < no_row; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_row, no_col;

        System.out.print("Enter the matrix size: ");
        no_row = sc.nextInt();
        no_col = sc.nextInt();

        int[][] array = new int[no_row][no_col];
        System.out.println("Enter matrix elements:");

        for (int i = 0; i < no_row; i++) {
            for (int j = 0; j < no_col; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        making0(array, no_row, no_col);

        System.out.println("Modified matrix:");
        for (int i = 0; i < no_row; i++) {
            for (int j = 0; j < no_col; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }

        sc.close();
    }
}
