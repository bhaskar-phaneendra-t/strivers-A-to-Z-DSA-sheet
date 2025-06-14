package Standard_codes;

import java.util.ArrayList;

public class swap {

    public static void main(ArrayList<Integer> array,int i,int j) {
        int temp=array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }
}
