package binary_search;
import java.util.*;

public class floor_and_ciel {
    private static ArrayList<Integer> floor_ciel(ArrayList<Integer>array,int target){
        ArrayList<Integer> ans=new ArrayList<>();
        Collections.sort(array);
        int i=0;
        int j=array.size()-1;
        int upper_bound=Integer.MAX_VALUE;
        int lower_bound=Integer.MIN_VALUE;
        while(i<=j){
            int mid=(i+j)/2;
            if(array.get(mid)>target){
                upper_bound=Math.min(upper_bound, array.get(mid));
                j=mid-1;
            }
            else if(array.get(mid)<=target){
                lower_bound=Math.max(lower_bound,array.get(mid));
                i=mid+1;
            }
        }
        ans.add(lower_bound);
        ans.add(upper_bound);
        return ans;
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
            for(Integer it:floor_ciel(array,target)){
                System.out.println(it);
            }
            scanner.close();
        }
}
