package Mathematics;
/*
Number divide itself
here we are dividing number by iteration i * i square
for large number it is taking less time
 */
public class CheckPrime {

    public static boolean isPrime(int n){
        if(n ==1)
            return false;
        for(int i =2; i * i<n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Number is prime - "+isPrime(101));
    }
}
