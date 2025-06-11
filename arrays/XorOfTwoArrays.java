import java.util.*;

public class XorOfTwoArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> array1 = new ArrayList<>();
        List<Integer> array2 = new ArrayList<>();
        int xor1 = 0;
        int xor2 = 0;

        System.out.println("Enter the size of the first array:");
        int n1 = scan.nextInt();
        for (int i = 0; i < n1; i++) {
            System.out.println("Enter element " + i + " of the first array:");
            int z = scan.nextInt();
            array1.add(z);
            xor1 ^= z;
        }

        System.out.println("Enter the size of the second array:");
        int n2 = scan.nextInt();
        for (int i = 0; i < n2; i++) {
            System.out.println("Enter element " + i + " of the second array:");
            int z = scan.nextInt();
            array2.add(z);
            xor2 ^= z;
        }

        System.out.println("Number common element:");
        System.out.println(xor1 ^ xor2);

        scan.close();
    }
}
