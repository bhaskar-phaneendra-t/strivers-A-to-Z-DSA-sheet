package Standard_codes;

import java.util.*;

public class reverse {
    public static void main(ArrayList<Integer>array,int i,int j) {
        int temp;
        if(i<j){
            temp=array.get(i);
            array.set(i, array.get(j));
            array.set(j, temp);
            i++;
            j--;
            main(array, i, j);
        }
        
    }
}
