package Recursion;

import static java.util.Collections.swap;

/*
If given string x then it combination permutations are
x!
if string length 4 its possible factorial are 24 possible matches were found.
Incomplete programme
 */
public class StrPermutation {

    public static void fun(String s, int i){

        if(i==s.length()-1){
            System.out.print(s);
            return;
        }
        for(int j =i; j<s.length(); j++){
          //  swap(s[i], s[j]);
            fun(s,i+1);
          //  swap(s[i], s[j]);
        }
    }

    public static void main(String[] args) {
            String s ="ABC";
            int i =0;
            fun(s,i);
    }
}
