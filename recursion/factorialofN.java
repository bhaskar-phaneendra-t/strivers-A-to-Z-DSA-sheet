public class factorialofN {
    static int factorialofN(int n){
        @SuppressWarnings("unused")
        int factorial;
        if (n==0){return 1;}
        else{return factorial=n*factorialofN(n-1);}
    }
    public static void main(String[] args) {
        
        System.out.println(factorialofN(5));
    }
}
