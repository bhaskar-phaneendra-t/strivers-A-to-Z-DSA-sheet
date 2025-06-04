package sorting;

import java.util.Scanner;

public class quick_sort {
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static int pivote_index_function(int[] arr,int low, int high){
        int i=low+1;
        int j=high;
        while (true) {
            while(arr[low]>=arr[i]&&i<=high){i++;}
            while(arr[low]<arr[j]&&j>=low){j=j-1;}
            if(i<j){swap(arr,i,j);}
            else{break;}
        }
        swap(arr, low, j);
        return j;
    }
    protected static void quicksort(int[ ] arr, int low, int high){
        if(low<high){
            int pivote_index_reeturn=pivote_index_function(arr,low,high);
            quicksort(arr, low, pivote_index_reeturn-1);
            quicksort(arr, pivote_index_reeturn+1,high);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array length:");
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        quicksort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scan.close();
    }
    
}
