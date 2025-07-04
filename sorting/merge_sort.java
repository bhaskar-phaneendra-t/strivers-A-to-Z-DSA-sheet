package sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class merge_sort {

    private static void merge(ArrayList<Integer> arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr.get(left) <= arr.get(right)) {
                temp.add(arr.get(left));
                left++;
            } else {
                temp.add(arr.get(right));
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr.get(left));
            left++;
        }

        while (right <= high) {
            temp.add(arr.get(right));
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr.set(i, temp.get(i - low));
        }
    }

    public static void mergesort(ArrayList<Integer> arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergesort(arr, low, mid);
        mergesort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array length:");
        int n = scan.nextInt();
        
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());
        }

        mergesort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }

        scan.close();
    }
}
