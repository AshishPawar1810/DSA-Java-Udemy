package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParanthasis {

    public static boolean isMatching(char a, char b){
        if(a!=b){
            return false;
        }
        return true;
    }

    public static boolean isBalance(String s){
        Deque<Character> dq = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++){
            char x = s.charAt(i);
            if(x=='(' || x=='{' || x=='['){
                dq.push(x);
            }else{
                if(dq.isEmpty()==true){
                    return true;
                }else if(isMatching(dq.peek(),x)==false){
                    return false;
                }else{
                    dq.pop();
                }
            }
        }
        return dq.isEmpty()==true;
    }

    public static void main(String[] args) {
        String s="((()))";
        System.out.println("Is Balanced -> "+isBalance(s));
    }
}
