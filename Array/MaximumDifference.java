package Array;
/*
maximum diffrence between two element where as
right side element must me greater
arr[i+1]-arr[i]
a pair of element whoes diffrence is greater
 */
public class MaximumDifference {

    public static int maxDiff(int arr[]) {
        int n= arr.length;
        int res = arr[1]-arr[0];
        int min = arr[0];
        for(int j=1; j<n; j++){
            //int arr[]={2,3,10,4,6,8,1};
            res= Integer.max(res, arr[j]-min);
            min = Integer.min(min,arr[j]);
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[]={2,3,10,4,6,8,1};
        System.out.println("Max diff is -> "+maxDiff(arr));
    }
}
