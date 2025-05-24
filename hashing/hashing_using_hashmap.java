import java.util.Scanner;
import java.util.HashMap;

public class hashing_using_hashmap {
    public static int hash(int n,int[] arr,int hash){
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0)+1);
        }
        return mpp.getOrDefault(hash, 0);
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
        scan.close();   
    }
}
