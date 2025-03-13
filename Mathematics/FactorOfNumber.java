package Mathematics;

public class FactorOfNumber {

    public static int fac(int n){

        if(n == 0){
            return 1;
        }
        //recursion used here fac(n) calling itself
        return n * fac(n -1);
    }

    public static void main(String[] args) {
        System.out.println("Factor of number - "+fac(3));
    }
}
