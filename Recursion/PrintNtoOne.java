package Recursion;

public class PrintNtoOne {

    public static void fun(int n){
        if (n == 0) {
            return;
        }
        System.out.print(n);
        //tail recursion
        fun(n-1);
    }
    public static void main(String[] args) {
        fun(5);
    }
}
