package Searching;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
In this problem we have to find repeating element in array
we need to create boolean array of given size by value default false
check each element in given array and make entry by making true in seond array
Not working code
 */
public class RepeatingNumberFirst {

    public static int repEle(int arr[]){
        int n= arr.length;
        boolean visited[] = new boolean[n-1];
        for(int i=0; i<n-1; i++){
            if(visited[i]) {
                return arr[i];
            }
            visited[i]= true;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] ={0,2,1,3,2,2,2};
        Arrays.sort(arr);
        System.out.println("Repeating ele is -> "+repEle(arr));
    }
}
