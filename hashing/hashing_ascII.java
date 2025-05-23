import java.util.Scanner;

public class hashing_ascII {
    public static int hash(String s,char c){
        int[] newarr=new int[256];
        for(int i=0;i<s.length();i++){
            newarr[s.charAt(i)]=newarr[s.charAt(i)]+1;
        }
        return newarr[c];
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        char c=scan.next().charAt(0);
        scan.close();
        System.out.println(hash(s, c));

    }
}