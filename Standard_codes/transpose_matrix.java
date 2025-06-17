package Standard_codes;

import java.util.ArrayList;

public class transpose_matrix {  
    public static void main(ArrayList<ArrayList<Integer>> matrix, int rows, int cols) {
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
}
