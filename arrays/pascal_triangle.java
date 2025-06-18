import java.util.ArrayList;
import java.util.Scanner;

public class pascal_triangle{

    // Function to calculate value at given row and column using nCr
    public static int functionRcC(int row, int column) {
        int result = 1;
        for (int i = 0; i < column; i++) {
            result = result * (row - i) / (i + 1);
        }
        return result;
    }

    // Function to return a row in Pascal's Triangle
    public static ArrayList<Integer> rowDisplay(int row) {
        ArrayList<Integer> array = new ArrayList<>();
        int result = 1;
        array.add(result);
        for (int i = 0; i < row; i++) {
            result = result * (row - i) / (i + 1);
            array.add(result);
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, column, preference;

        System.out.println("Enter the following number:");
        System.out.println("1 -- for the particular element in the Pascal triangle by entering the row and column");
        System.out.println("2 -- for the particular row printing");
        System.out.println("3 -- for the full Pascal triangle");

        preference = scanner.nextInt();

        if (preference == 1) {
            System.out.println("Enter the row and column that you want:");
            row = scanner.nextInt();
            column = scanner.nextInt();
            System.out.println(functionRcC(row, column));
        } else if (preference == 2) {
            System.out.println("Enter the row you want:");
            row = scanner.nextInt();
            ArrayList<Integer> resultRow = rowDisplay(row);
            for (int val : resultRow) {
                System.out.print(val + "   ");
            }
            System.out.println();
        } else if (preference == 3) {
            System.out.println("Enter how many rows of Pascal triangle you want:");
            int pascal = scanner.nextInt();
            for (int i = 0; i <= pascal; i++) {
                ArrayList<Integer> resultRow = rowDisplay(i);
                for (int val : resultRow) {
                    System.out.print(val + "  ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Wrong entry");
        }

        scanner.close();
    }
}
