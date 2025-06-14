import java.util.*;
import sorting.merge_sort;

public class sumoftwoelementsinanarray {
    private static ArrayList<Integer> sumoftwonumber(ArrayList<Integer>array,int sum){
        int low=0;
        int high=array.size()-1;
        int botsum=0;
        ArrayList<Integer> ele = new ArrayList<>();
        
        while(low<high){
            botsum=array.get(low)+array.get(high);
            if(botsum>sum){
                high--;
            }
            else if(botsum<sum){
                low++;
            }
            else if(botsum==sum){
                ele.add(array.get(low));
                ele.add(array.get(high));
                break;
            }
            
        }
        return ele;
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("enter the size");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("enter the  element");
            int z = scanner.nextInt();
            array.add(z);
        }
        
        merge_sort.mergesort(array,0,array.size()-1);
        System.out.println("enter the sum of the elements that you want");
        int sum=scanner.nextInt();
        for(Integer nums:sumoftwonumber(array, sum)){
            System.out.print(nums+"   ");
        }

        
        scanner.close();
    }
}