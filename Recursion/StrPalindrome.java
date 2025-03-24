package Recursion;

public class StrPalindrome  {

    public static boolean fun(String str, int start, int end){
        if(start >= end){
            return true;
        }

        return(str.charAt(start)==str.charAt(end) && fun(str,start+1,end-1));
    }
    public static void main(String[] args) {
        String str = "aaabaaa";
        int start =0;
        int end =str.length()-1;
        System.out.println("str is palindrome -> "+fun(str,start,end) );
    }
}
