package matrix;

import java.util.*;

public class RotateMatrix90 {
    
    public static void transpose(ArrayList<ArrayList<Integer>> matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) {
                if (i != j) {
                    int temp = matrix.get(i).get(j);
                    matrix.get(i).set(j, matrix.get(j).get(i));
                    matrix.get(j).set(i, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        
        System.out.print("Enter the matrix size: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                row.add(sc.nextInt());
            }
            matrix.add(row);
        }

        transpose(matrix, rows, cols);

        for (ArrayList<Integer> row : matrix) {
            Collections.reverse(row);
        }

        for (ArrayList<Integer> row : matrix) {
            for (int num : row) {
                System.out.print(num + "   ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
