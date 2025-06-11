import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class unionoftwoarrays {
    protected static Set<Integer> unionthearray(ArrayList<Integer>array1,ArrayList<Integer>array2){
        Set<Integer>myset = new HashSet<>();
        for(Integer num:array1){
            myset.add(num);
        }
        for (Integer num : array2) {
            myset.add(num);
        }
        return myset;

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> array1=new ArrayList<>();
        ArrayList<Integer> array2=new ArrayList<>();
        int size1,size2;
        int z=0;
        System.out.println("enter the size of the array 1");
        size1=scan.nextInt();

        for (int i = 0; i < size1; i++) {
            System.out.println("enter the elements" + (i+1));
            z=scan.nextInt();
            array1.add(i, z);
            
        }

        System.out.println("enter the size of the array 12");
        size2=scan.nextInt();

        for (int i = 0; i < size2; i++) {
            System.out.println("enter the elements" + (i+1));
            z=scan.nextInt();
            array1.add(i, z);
            
        }
        System.out.println("the array with no duplicates");
        for(int num:unionthearray(array1, array2)){
            System.out.print(num+" ");
        }

    }
}
