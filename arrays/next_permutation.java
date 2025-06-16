import java.util.*;

import Standard_codes.reverse;
import Standard_codes.swap;

public class next_permutation  {
    private static void next_permutation(ArrayList<Integer>array){
        int ind=-1;
        int size=array.size();
        for (int i =size-2 ; i >-1; i--) {
            if (array.get(i)<array.get(i+1)) {
                ind=i;
                break;
            }
        }
        for (int i = size-1; i >= ind; i--) {
            if(array.get(i)>array.get(ind)){
                swap.main(array, i, ind);
            }
        }
        if(ind==-1){
            reverse.main(array, 0, size-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            int z = scanner.nextInt();
            array.add(z);
        }

        next_permutation(array);
        for(Integer it:array){
            System.out.print(it);
        }
        
        scanner.close();
    }
}