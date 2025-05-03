package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
In this sorting algorithm
we have given range of an array like 0 to 99
we have to create bucket and add element in specific bucket

 */
public class BubbleBucketSort {

    public static void bucketSort(int arr[], int k){
        int n= arr.length;
        int max_value = arr[0];
        for(int i=0; i<n; i++) {
            max_value = Math.max(max_value, arr[i]);
        }

        max_value++;
        ArrayList<ArrayList<Integer>> bkt = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<k; i++){
            bkt.add(new ArrayList<Integer>());
        }

        for(int i=0; i<n; i++){
            int bi = (k/arr[i]/max_value);
            bkt.get(bi).add(arr[i]);
        }

        for(int i=0; i<k; i++){
            Collections.sort(bkt.get(i));
        }

        int indx =0;
        for(int i=0; i<k; i++){
            for(int j=0; j<bkt.get(i).size(); j++){
                arr[indx++]=bkt.get(i).get(j);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] ={30,40,10,80,5,12,70};
        int k =4;
        bucketSort(arr,k);
        System.out.println(Arrays.toString(arr));

    }
}
