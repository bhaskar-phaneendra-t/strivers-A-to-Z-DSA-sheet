import java.util.*;

public class UnionAndQuicksort {

    // QuickSort pivot function
    public static int quicksortPivot(List<Integer> array, int low, int high) {
        int i = low + 1;
        int j = high;
        int pivot = array.get(low);

        while (true) {
            while (i <= high && array.get(i) <= pivot) {
                i++;
            }
            while (j >= low && array.get(j) > pivot) {
                j--;
            }
            if (i < j) {
                Collections.swap(array, i, j);
            } else {
                break;
            }
        }
        Collections.swap(array, low, j);
        return j;
    }

    // QuickSort function
    public static void quicksort(List<Integer> array, int low, int high) {
        if (low < high) {
            int pivotIndex = quicksortPivot(array, low, high);
            quicksort(array, low, pivotIndex - 1);
            quicksort(array, pivotIndex + 1, high);
        }
    }

    // Function to compute union using Set
    public static Set<Integer> union(List<Integer> array1, List<Integer> array2) {
        Set<Integer> mySet = new HashSet<>();
        int i = 0, j = 0;
        while (i < array1.size() || j < array2.size()) {
            if (i < array1.size()) {
                mySet.add(array1.get(i));
                i++;
            } else if (j < array2.size()) {
                mySet.add(array2.get(j));
                j++;
            }
        }
        return mySet;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> array1 = new ArrayList<>();
        List<Integer> array2 = new ArrayList<>();

        System.out.println("Enter the size of the first array:");
        int n1 = scan.nextInt();
        for (int i = 0; i < n1; i++) {
            System.out.println("Enter the element of the 1st array at index " + i + ":");
            array1.add(scan.nextInt());
        }

        System.out.println("Enter the size of the second array:");
        int n2 = scan.nextInt();
        for (int i = 0; i < n2; i++) {
            System.out.println("Enter the element of the 2nd array at index " + i + ":");
            array2.add(scan.nextInt());
        }

        // Get union as a set
        Set<Integer> newSet = union(array1, array2);

        // Convert set to list for sorting
        List<Integer> sortedList = new ArrayList<>(newSet);

        // Sort the union using quicksort
        quicksort(sortedList, 0, sortedList.size() - 1);

        // Print sorted union
        System.out.println("Sorted union of the arrays:");
        for (int num : sortedList) {
            System.out.print(num + " ");
        }

        scan.close();
    }
}
