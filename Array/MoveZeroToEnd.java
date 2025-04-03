package Array;

import java.util.Arrays;

public class MoveZeroToEnd {

    public static void movZ(int arr[]){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                arr[count++] = arr[i];
        }
        while (count < arr.length)
            arr[count++] = 0;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {10,20,0,0,30,40};
        movZ(arr);
    }
}
