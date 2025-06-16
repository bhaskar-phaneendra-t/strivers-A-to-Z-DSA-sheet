package Standard_codes;

import java.util.*;

public class max_of_the_array{
    public static int main(ArrayList<Integer>array,int k,int j) {
        int max = Integer.MIN_VALUE;
        
        for (int i=k ; i <= j; i++) {
            max=Math.max(array.get(i), max);
        }
        return max;
    }
}