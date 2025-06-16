import java.util.*;

public class longest_consecutive_of_array {
    private static int consecutive(ArrayList<Integer>array){
        Set<Integer> set=new HashSet<>(array) ;
        int longest = 0;

        for (Integer num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                longest = Math.max(longest, currentStreak);
            }
        }

        return longest;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            int z = scanner.nextInt();
            array.add(z);
        }
        System.out.println(consecutive(array));
        
        scanner.close();
    }
}