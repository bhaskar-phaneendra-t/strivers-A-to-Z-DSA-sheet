import java.util.*;

public class binary_search {
    private static boolean binary_serach_number(ArrayList<Integer>array,int target){
        int i=0;
        int j=array.size()-1;
        array.sort((a, b) -> a - b);
        while(i<=j){
            int mid=(i+j)/2;
            if(array.get(mid)==target){
                return true;
            }
            else if(array.get(mid)>target){
                j=mid-1;
            }
            else {
                i=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            int z = scanner.nextInt();
            array.add(z);
        }
        int target;
        System.out.println("enter the value of the target");
        target=scanner.nextInt();

        
        System.out.println(binary_serach_number(array,target));
        
        scanner.close();
    }
}
