package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElement {

    public static ArrayList<Integer> nextGret(int arr[]){
        int n=arr.length;
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        s.push(arr[n-1]);
        al.add(-1);
        for(int i=n-2; i>=0; i--){
            while(s.isEmpty()==false && s.peek()<=arr[i]){
                s.pop();
            }
            int ng = s.isEmpty() ? -1 : s.peek();
            al.add(ng);
            s.push(arr[i]);
        }
        return al;
    }

    public static void main(String[] args) {
        int arr[]={5,15,10,8,6,12,9,18};
        ArrayList<Integer> rs =nextGret(arr);
        Collections.sort(rs, Collections.reverseOrder());
        System.out.print(rs);


    }
}
