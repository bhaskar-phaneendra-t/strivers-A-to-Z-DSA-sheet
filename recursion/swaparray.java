import java.util.Scanner;

public class swaparray {
    static void swaparray(int i,int arr[],int n){
        if (i>=n/2){return ;}
        else{swap(arr,i,n-i-1);}
        swaparray(i+1, arr, n);
    }
    private static void swap(int[] arr,int i, int j) {
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n;
        System.out.println("enter the array length");
        n=scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        swaparray(0, arr, n);
        scan.close();
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
