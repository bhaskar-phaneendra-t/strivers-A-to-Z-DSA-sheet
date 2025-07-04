package binary_search;

import java.util.*;

public class upper_bound {
    private static int upper_bound_index(ArrayList<Integer> array, int target) {
        Collections.sort(array); // Ensure the array is sorted

        int i = 0;
        int j = array.size() - 1;
        int ans = array.size();  

        while (i <= j) {
            int mid = (i + j) / 2;

            if (array.get(mid) > target) {
                ans = mid;     
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();

        System.out.println("Enter the number of elements:");
        int size = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            array.add(scanner.nextInt());
        }

        System.out.println("Enter the target value:");
        int target = scanner.nextInt();

        int ubIndex = upper_bound_index(array, target);
        if (ubIndex == array.size()) {
            System.out.println("No element greater than target exists.");
        } else {
            System.out.println("Upper bound index: " + ubIndex);
            System.out.println("Upper bound value: " + array.get(ubIndex));
        }

        scanner.close();
    }
}
