package matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class SpiralMatrix {

    public static ArrayList<Integer> spiral(int[][] matrix, int no_row, int no_col) {
        int top = 0;
        int bottom = no_row - 1;
        int left = 0;
        int right = no_col - 1;
        ArrayList<Integer> result = new ArrayList<>();

        while (top <= bottom && left <= right) {
            // Left to right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // Top to bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // Right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_row, no_col;

        System.out.print("Enter the matrix size (rows and columns): ");
        no_row = sc.nextInt();
        no_col = sc.nextInt();

        int[][] matrix = new int[no_row][no_col];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < no_row; i++) {
            for (int j = 0; j < no_col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        ArrayList<Integer> spiralOrder = spiral(matrix, no_row, no_col);

        System.out.println("Spiral Order:");
        for (int num : spiralOrder) {
            System.out.print(num + "  ");
        }
    }
}
