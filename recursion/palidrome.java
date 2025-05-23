import java.util.Scanner;
    

public class palidrome {
    public static boolean pali(int i,String s){
        if(i>=s.length()/2){return true;}
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){return false;}
        
        return pali(i+1,s);
    }
    public static void main(String[] args) {
        String s = null;
        String cleaned="";
        Scanner scan=new Scanner(System.in);
        s=scan.nextLine();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                cleaned+=s.charAt(i);
            }
        }
        scan.close();
        cleaned.toLowerCase();
        System.out.println(cleaned);
        System.out.println(pali(0, cleaned));
        

    }
}
