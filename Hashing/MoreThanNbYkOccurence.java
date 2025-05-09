package Hashing;

import java.util.HashMap;
import java.util.Map;

/*
You have given K value
you can find arr length
n/k =o/p
 you need to  find the element which has more occurence than n/k in array
 eg [ 30 10 20 20 10 20 30 ]
 k=4
 ans = n/k =
 o/p = 20 30
 */
public class MoreThanNbYkOccurence {

    public static void printNByK(int arr[] , int k ){
        int n= arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int x : arr){
            map.put(x,  map.getOrDefault(x,0)+1);
        }

        for(Map.Entry<Integer,Integer> m: map.entrySet()){
            if(m.getValue()> n/k){
                System.out.println(" "+m.getKey());
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,10,10,20};
        printNByK(arr,4);
    }

}
