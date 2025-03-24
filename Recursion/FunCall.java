package Recursion;

public class FunCall {

    public static void funCall(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funCall(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        funCall(5);
    }
}
