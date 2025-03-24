package Recursion;
/*
in this problem we are dividing input by 2 and stroing reminder as 1
eg 13/2 = 6.5   .5 =1 as remider storing
pringing that in reverse order
Recursion are print value on basis of
Log 2 base of n

 */
public class DecimalToBinary {

    public static void fun(int n){
        if(n==0)
            return;
        fun(n/2);
        System.out.print(n%2);

    }

    public static void main(String[] args) {
        fun(13);
    }
}
