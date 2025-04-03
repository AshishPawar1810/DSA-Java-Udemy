package Array;

import java.util.Arrays;

public class ElementOccrenceCount {

    public static void occ(int arr[]){
        int n= arr.length;
        int fre=1;
        int i=1;
        while(i<n){
            while(i<n && arr[i]==arr[i-1]){
                fre++;
                i++;
            }
            System.out.println(arr[i-1] +" - "+fre);
            i++;
        }
    }

    public static void main(String[] args) {
        int arr[] ={10,50,50,50,10,20,5,5};
        Arrays.sort(arr);
        occ(arr);

    }
}
