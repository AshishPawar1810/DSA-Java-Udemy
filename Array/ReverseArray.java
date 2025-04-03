package Array;

public class ReverseArray {

    public static void rev(int arr[]){
        int low =0;
        int high = arr.length-1;
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        System.out.println(java.util.Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        rev(arr);
        //System.out.println(rev(arr));
    }
}
