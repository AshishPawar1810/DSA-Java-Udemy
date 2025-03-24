package Recursion;

public class SumOfDigit{

    public static int fun(int n){
        if(n==0){
            return 0;
        }

        return fun(n/10) +(n%10);
    }

    public static void main(String[] args) {
        System.out.println("Sum of digit -> "+fun(252511));

    }
}
