package BitMagic;

public class CountSetBitsTwo {

    public static int countSetBits(int n){
        int res =0;
        while(n >0){
            n = n & (n-1);
            res = res + 1;

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("bit count - "+countSetBits(255));
    }
}
