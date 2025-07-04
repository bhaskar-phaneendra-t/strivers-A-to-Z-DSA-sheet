package binary_search;

import java.util.*;

public class upper_bound {
    private static int upper_bound_index(ArrayList<Integer> array, int target) {
        
        Collections.sort(array);

        int i = 0;
        int j = array.size() - 1;
        int ans = array.size(); 

        while (i <= j) {
            int mid = (i + j) / 2;
            if (array.get(mid) > target) {
                ans = array.get(mid);    
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

        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            array.add(scanner.nextInt());
        }

        System.out.println("Enter the value of the target:");
        int target = scanner.nextInt();

        int lbIndex = upper_bound_index(array, target);
        System.out.println("upper bound index: " + lbIndex);

        scanner.close();
    }
}
