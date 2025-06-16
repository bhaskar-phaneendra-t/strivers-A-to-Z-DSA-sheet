import java.util.*;

import Standard_codes.max_of_the_array;


public class leaders_of_array{
    private static ArrayList<Integer> leaders(ArrayList<Integer> array){
        ArrayList <Integer> newlist=new ArrayList<>();
        int size=array.size();
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < array.size(); i++) {
            max=max_of_the_array.main(array, i+1, size-1);
            if(array.get(i)>max){
                newlist.add(array.get(i));
            }
        }
        return newlist;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            int z = scanner.nextInt();
            array.add(z);
        }

        for(Integer it:leaders(array)){
            System.out.print(it+"   ");
        }
        
        scanner.close();
    }
}