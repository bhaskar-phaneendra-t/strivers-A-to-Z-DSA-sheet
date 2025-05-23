import java.util.Scanner;
public class hashing_numbers {
    public static int hash(int n,int[] arr,int hash){
        int[] newarr=new int[1000];
        for(int i=0;i<n;i++){
            newarr[arr[i]]=newarr[arr[i]]+1;
        }
        return newarr[hash];
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,hash;
        n=scan.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
        }
        hash=scan.nextInt();
        System.out.println(hash(n, arr, hash));
        
    }
}
