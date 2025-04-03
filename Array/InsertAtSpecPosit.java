package Array;

import java.util.Arrays;

/*
inserrt element at specific positiion

 */
public class InsertAtSpecPosit {

    public static void insertAt(int arr[], int n, int x, int cap, int pos){
        if(n==cap)
            return;
        int indx = pos-1;
        for (int i = arr.length - 1; i > indx; i--) {
            arr[i] = arr[i - 1];
        }
        arr[indx] = x;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {5,7,10,20,};
        int cap = arr.length;
        int n = cap;
        int x=3;
        int pos =1;
        insertAt(arr,n,x,cap,pos);
       }
}
