import java.util.*;

import Standard_codes.swap;

public class dutch_national_flag_algorithm_for_012 {
    private static void algo(ArrayList<Integer>array){
        int low=0;
        int n=array.size();
        int mid=0;
        int high=n-1;
        while (mid<high) {
            if(array.get(mid)==0){
            swap.main(array, low, mid);
            low++;
            mid++;
        }
        else if(array.get(mid)==1){
            mid++;
        }
        else{
            swap.main(array, mid, high);
            high--;
        }

            
        }
        

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            int z = scanner.nextInt();
            if(z<3 &&z>=0){
                array.add(z);
            }
            else{
                System.out.println("you have entered other than 0 1 2");
                break;
            }
        }
        algo(array);
        for(Integer num:array){
            System.out.print(num+"   ");
        }


        
        scanner.close();
    }
}