import java.util.ArrayList;
import java.util.Scanner;

public class sendingzerostoend {
    private static void swap(ArrayList<Integer>array,int i,int j){
        int temp=array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }
    private static void zerotolast(ArrayList<Integer>  array){
        int start=0;
        int end=array.size()-1;
        while(start<=end){
            if(array.get(start)==0&&array.get(end)!=0){
            swap(array,start,end);
            start++;
            end--;
        }   
        else if(array.get(start)==0&& array.get(end)==0){
            end--;
        }
        else{
            start++;
        }

        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();
        Scanner scan= new Scanner(System.in);
        int size;
        System.out.println("enter the size of the array");
        size=scan.nextInt();
        int z;
        for (int i = 0; i < size; i++) {
            System.out.println("enter the elements that should be stored in the array "+(i+1));
            z=scan.nextInt();
            array.add(z);
        }
        zerotolast(array);
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i)+" ");
        }


    }
}
