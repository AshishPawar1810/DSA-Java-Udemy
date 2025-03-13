package Mathematics;
/*
Lasavi here,
here note that it is opposite of GCD
in gcd we are getting highest divisor factor for two number
N/D we was finding D
IN LCD we have to find N for two numbers
 */
public class LCDOfNum {

   public static int gcdFact(int a, int b){
       if(b == 0)
           return a;
       return gcdFact(b, a%b);
   }

   public static int lcdFact(int a, int b){
       return a * b / gcdFact(a,b);
   }

    public static void main(String[] args) {
        System.out.println("LCD of num is - "+lcdFact(6,4));

    }
}
