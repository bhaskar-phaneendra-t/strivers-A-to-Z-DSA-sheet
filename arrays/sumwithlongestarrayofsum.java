import java.util.*;

public class sumwithlongestarrayofsum {


    private static int sumvector(List<Integer> array, int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += array.get(k);
        }
        return sum;
    }


    private static List<Integer> vectorsum(List<Integer> array, int enteredvalueofsum) {
        int len = 0;
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            for (int j = i; j < array.size(); j++) {
                int sum = sumvector(array, i, j);
                if (sum == enteredvalueofsum) {
                    if ((j - i + 1) > len) {
                        len = j - i + 1;
                        indexes.clear();
                        indexes.add(i);
                        indexes.add(j);
                    }
                }
            }
        }

        return indexes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();

        System.out.println("enter the size");
        int size = sc.nextInt();

        System.out.println("enter array elements");
        for (int i = 0; i < size; i++) {
            array.add(sc.nextInt());
        }

        System.out.println("enter the sum you want");
        int sumofthearray = sc.nextInt();

        List<Integer> index = vectorsum(array, sumofthearray);

        if (index.isEmpty()) {
            System.out.println("cannot find the indexees");
        } else {
            System.out.print("Longest subarray with sum " + sumofthearray + ": ");
            for (int i = index.get(0); i <= index.get(1); i++) {
                System.out.print(array.get(i) + " ");
            }
        }

        sc.close();
    }
}
