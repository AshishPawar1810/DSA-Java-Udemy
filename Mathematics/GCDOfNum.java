package Mathematics;
//Lasavi ani Masavi
//GCD = Greatest common division , large number which divide and come last
//eg. 6 and 4 two no divisable numbers are 1, 2 GCD = 2
//Euclicdean algorithm: we are using here
//
public class GCDOfNum {

    public static int gchFact(int a, int b){
        while(a != b){
            if(a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Gcd of number is - "+gchFact(100,200));
    }
}
