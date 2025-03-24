package Recursion;
/*
sum = n -1
eg sum of 4 is = 4 +3 +2 +1 =10
 */
public class SumOfNaturalNumber {

    public static int natNum(int n){
        if(n ==0){
            return 0;
        }
        return n + natNum(n-1);

    }
    public static void main(String[] args) {
        System.out.println("Sum of nat num -> "+natNum(4));
    }
}
