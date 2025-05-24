package sorting;
import java.util.Scanner;

public class bubblearray {
    static void bubblesortthearray(int[] arr, int n){
        int count=0;
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){swap(arr, j, j+1);
                count++;}
            }
        }
        System.out.println(count+"these many times the array is swaped ");
    }
    static void swap(int[] arr, int i, int j) {
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
        bubblesortthearray(arr, n);
        
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scan.close();
    }
}
