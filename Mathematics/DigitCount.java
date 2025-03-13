package Mathematics;

public class DigitCount {
    public static int digitCount(long n) {
    int x = 0;
    while(n >0)
    {
        n = n / 10;
        x++;
    }
    return x;
}

    public static void main(String[] args) {
        System.out.println("Length of number "+digitCount(23892));
    }
}
