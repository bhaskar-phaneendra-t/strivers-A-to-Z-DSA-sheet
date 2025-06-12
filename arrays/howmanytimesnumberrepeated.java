import java.util.*;

public class howmanytimesnumberrepeated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            int z = scanner.nextInt();
            array.add(z);
        }
        long key;
        Map<Long,Integer>mpp=new HashMap<>();
        for(int i=0;i<array.size();i++){
            key=array.get(i);
            mpp.put(key,mpp.getOrDefault(key, 0)+1);
        }
        for(Map.Entry<Long,Integer> entry:mpp.entrySet()){
            System.out.println(entry.getKey()+" appears "+entry.getValue());
        }
        
        scanner.close();
    }
}