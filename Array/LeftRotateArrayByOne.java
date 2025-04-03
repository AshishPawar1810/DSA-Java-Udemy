package Array;

import java.util.Arrays;

public class LeftRotateArrayByOne {

    public static void leftRo(int arr[]){
        int temp = arr[0];
        int n=arr.length;
        for(int i=1; i<n; i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr []={1,3,5,7,8};
        leftRo(arr);
    }
}
