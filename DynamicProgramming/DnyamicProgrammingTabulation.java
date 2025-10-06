package DynamicProgramming;
/*
Tabulation :
another part of dp
which help to look bottom up approach

 */
public class DnyamicProgrammingTabulation {

    public static int fabonic(int n){

        if(n<=1){
            return n;
        }

        int prev1 =1;
        int prev2=0;
        int curr=0;
        for(int i=2; i<n; i++){
            curr = prev1 + prev2;
            prev2=prev1;
            prev1=curr;
        }
        return curr;
    }

    public static void main(String[] args) {
        int n=5;
        int result = fabonic(n);
        System.out.println(result);
    }
}
