package String;

import java.util.regex.Pattern;

public class ReverseWordInString {

    public static void reverseStr(String str){
        String[] s=str.split(" ");
        for(int i=s.length-1; i>=0; i--){
            System.out.print(s[i]+" ");
        }
    }

    public static void main(String[] args) {
        String s1="Welcome to geeks for geeks";
        reverseStr(s1);
    }
}
