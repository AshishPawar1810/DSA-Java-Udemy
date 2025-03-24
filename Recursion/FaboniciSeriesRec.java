package Recursion;

public class FaboniciSeriesRec {

    public static int fun(int n){
        if(n <=1){
            return 1;
        }
        return fun(n-1) + fun(n-2);
    }

    public static void main(String[] args) {
        for(int i =1; i<10; i++){
            System.out.println("Fabb series -> "+fun(i));
        }
    }
}

