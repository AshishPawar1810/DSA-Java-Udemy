package Mathematics;
/*
this gives solution to find a number which is divisalbe to given number
and it is prime
solution is not complete so not run
time compl = theta(sequre root of n)
 */
public class PrimeFactors {

    public static void primeFactor(int n){
        if(n !=0 && n !=1) {
            while (n % 2 == 0) {
                System.out.println(2);
                n = n / 2;
            }

            while (n % 3 == 0) {
                System.out.println(3);
                n = n / 3;
            }

            for (int i = 5; i * i < n; i = i + 6) {
                while (n % i == 0) {
                    System.out.println(i);
                    n = n / i;
                }
                while (n % (i + 2) == 0) {
                    System.out.println(i);
                    n = n / (i + 2);
                }

                if (n > 3) {
                    System.out.println(n);
                }
            }
        }


    }
    public static void main(String[] args) {
       // System.out.println("Prime factor of number - "+primeFactor(101));
        primeFactor(101);

    }
}
