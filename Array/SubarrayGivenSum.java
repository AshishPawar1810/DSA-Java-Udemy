package Array;
/*
Need to find sum from given array element
if it satisfy return YES
 */
public class SubarrayGivenSum {

    public static boolean sumFind(int arr[], int sum){
        int n= arr.length;
        int res=0;
        int curr =0;

        for(int i=0; i<n; i++){
            curr += arr[i];
            while (sum < curr){
                curr -= arr[i];
                sum++;
            }
            if(curr==sum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] ={4,8,12,5};
        int sum =17;
        System.out.println("Sum element present -> "+sumFind(arr,sum));
    }
}
