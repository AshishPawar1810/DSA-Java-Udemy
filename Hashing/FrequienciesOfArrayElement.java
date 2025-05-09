package Hashing;

import java.util.HashMap;
import java.util.Map;

/*
counting repeating element
 */
public class FrequienciesOfArrayElement {

    public static void dupCount(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x: arr){
            map.put(x, map.getOrDefault(x,0)+1);
        }

        for(Map.Entry<Integer,Integer> c:map.entrySet()){
            System.out.println(c.getKey()+"-"+c.getValue());
        }

    }
    public static void main(String[] args) {
        int arr[]={10,20,10,20,30};
        dupCount(arr);
    }
}
