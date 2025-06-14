import java.util.*;
import Standard_codes.swap;

public class alternative_pos_neg {
    private static void alternative(ArrayList<Integer>array){
        int pos=0;
        int neg=1;
        while(pos<array.size() && neg<array.size()){
            if(array.get(pos)>=0){
                pos=pos+2;
            }
            else if(array.get(neg)<0){
                neg=neg+2;
            }
            else if(array.get(neg)>=0&&array.get(pos)<0){
                swap.main(array, neg, pos);
            }
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
        alternative(array);
        for (Integer element:array) {
            System.out.print(element+"   ");
        }
        scanner.close();
    }
}