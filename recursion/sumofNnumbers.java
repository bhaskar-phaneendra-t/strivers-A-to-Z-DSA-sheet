
public class sumofNnumbers {
    static int sumofNnumbers(int N){
        if(N==0){return 0;}
        else{return N+sumofNnumbers(N-1);}
    }
    public static void main(String[] args) {
        System.out.println(sumofNnumbers(5));

    }
}
