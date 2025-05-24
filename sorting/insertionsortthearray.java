package sorting;

import java.util.Scanner;

public class insertionsortthearray {
    static void bubblesort(int[] arr,int n){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j >0; j--) {
                if(arr[j-1]>arr[j]){
                    swap(arr, j-1, j);
                }
                
            }
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
        bubblesort(arr, n);
        

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scan.close();
    }
    
}
