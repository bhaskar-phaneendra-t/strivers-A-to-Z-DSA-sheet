/*
 * article:
 * https://takeuforward.org/arrays/search-insert-position/
 * 
 * leetcode:
 * https://leetcode.com/problems/search-insert-position/#:~:text=Search%20Insert%20Position%20%2D%20LeetCode&text=Given%20a%20sorted%20array%20of,(log%20n)%20runtime%20complexity.
 */



package binary_search;
import java.util.*;

public class element_search {
    private static int element_to_fit(ArrayList<Integer>array,int target){
        Collections.sort(array);
        int i=0;
        int j=array.size()-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(array.get(mid)==target){
                return mid;
            }
            else if(array.get(mid)>target){
                j=mid-1;
            }
            else i=mid+1;
        }
        return j+1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            int z = scanner.nextInt();
            array.add(z);
        }
        int target=0;
        System.out.println("enter the value of the target");
        target=scanner.nextInt();
        System.out.println(element_to_fit(array, target));
        scanner.close();
    }
}
