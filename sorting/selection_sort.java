package sorting;
import java.util.Scanner;

public class selection_sort {
    static void selection(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {  
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the array length:");
        n = scan.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        selection(arr, n);
        

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scan.close();
    }
}
