package BitMagic;
/*
Count set bits
this type of problem is use to count 1 in binary number
how may one present in binary number
In java binary number can be represented till 32 bits
0000 0000 0000 0000 0000 0000 0000 0000
In this problem we are moving given bits to left
so it become zero
 */
public class CountSetBits {

    public static int countBits(int n){
        int count = 0;
        while(n > 0){
            if(n % 2 ==1){
                count ++;
            }
            n = n/2;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Bits count - "+countBits(5));
    }
}
