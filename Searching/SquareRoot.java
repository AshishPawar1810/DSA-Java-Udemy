package Searching;
/*
find the square root of given number
number 4 to 8 square root is 2
9 has square root of 3

 */
public class SquareRoot {

    public static int squareRoot(int x){
        int low =1;
        int high = x;
        int ans =0;
        while(low<=high){
            int mid = (low+high)/2;
            int mSq =mid * mid;
            if(mSq==x){
                return mid;
            }
            else if(mSq>x)
                high=mid-1;
            else
                low=mid+1;
                ans=mid;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Sq root is -> "+squareRoot(10));
    }
}
