package Mathematics;
/*
here we are removing last all zeros in factorial
 */
public class TrailingZeroInFact {

    public static int trialZero(int n){
        if(n ==0){
            return 1;
        }
        return n * trialZero(n -1);
    }
    public static void main(String[] args) {
        int removeZero = trialZero(10);
        int reslt =0;
        while(removeZero % 10 == 0){
            //removeZero
        }
    }
}
