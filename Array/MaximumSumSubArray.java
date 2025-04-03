package Array;
/*
Sub array : contigeous element occoruence called sub array

 */
public class MaximumSumSubArray {

    public static int maxSub(int arr[]){
        int max = arr[0];
        int res = arr[0];
        for(int i =1; i<arr.length; i++){
            max = Integer.max(max+arr[i],arr[i]);
            res= Integer.max(res,max);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {-3,8,-2,4,-5,6};
        System.out.println("Max sum -> "+maxSub(arr));
    }
}
