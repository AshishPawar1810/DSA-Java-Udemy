package stack;

import java.util.Stack;

public class PreviousGreaterElement {

    public static void preGreater(int arr[]){
        int n=arr.length;
        Stack<Integer> s = new Stack<>();
        s.push(arr[0]);
        for(int i=0; i<n; i++){
            while(s.isEmpty()==false && s.peek()<=arr[i]){
                s.pop();
            }
            int pg = s.isEmpty() ? -1:s.peek();
            System.out.print(" "+pg);
            s.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[]={20,30,10,5,15};
        preGreater(arr);
    }
}
