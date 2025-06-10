import java.util.ArrayList;
import java.util.Scanner;

public class rotateanarray {

    public static void reverse(ArrayList<Integer> array, int start, int end) {
        while (start < end) {
            int temp = array.get(start);
            array.set(start, array.get(end));
            array.set(end, temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();

        System.out.println("Enter the size of the array:");
        int size = scan.nextInt();

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array.add(scan.nextInt());
        }

        System.out.println("Enter the number of elements to rotate:");
        int rotate = scan.nextInt();

        
        rotate = rotate % size;


        reverse(array, 0, rotate - 1);
        reverse(array, rotate, size - 1);
        reverse(array, 0, size - 1);

        System.out.println("The rotated array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
