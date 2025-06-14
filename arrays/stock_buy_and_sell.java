import java.util.*;

public class stock_buy_and_sell {
    public static ArrayList<Integer> array_of_vector_to_buy_and_sell_stock(ArrayList<Integer> array){
        int low=array.get(0);
        int cost=0;
        int profit=0;
        ArrayList<Integer> newarray=new ArrayList<>();
        for(Integer it:array){
            cost=it-low;
            
            profit=Math.max(profit,cost);
            if(cost>=profit){
                newarray.clear();
                newarray.add(low);
                newarray.add(it);
                newarray.add(profit);
            }

            low=Math.min(it,low);
        }
        return newarray;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            int z = scanner.nextInt();
            array.add(z);
        }
        for (Integer element:array_of_vector_to_buy_and_sell_stock(array)) {
            System.out.print(element+"   ");
        }
        
        scanner.close();
    }
}