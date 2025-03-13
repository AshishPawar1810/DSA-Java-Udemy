package Mathematics;

public class AllDivisorOfNum {

    public static void allDivNum(int n){
        for(int i =1; i * i <= n; i++){
            if(n % i == 0){
                System.out.println(i);
            }

            if(i != n/i){
                System.out.println(n/i);
            }
        }
    }
    public static void main(String[] args) {
        //System.out.println("All Divsior of num - "+allDivNum(10));
        allDivNum(50);
    }
}
