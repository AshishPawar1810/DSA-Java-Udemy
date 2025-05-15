package String;

import java.util.Arrays;

/*
print the count of distict charecters

 */
public class LongestSubStringDisChar {

    public static int longDis(String s){
        int n= s.length();
        int res=0;
        int prev[] = new int[256];
        int i=0;
        Arrays.fill(prev,-1);
        for(int j=0; j<n; j++){
            i=Math.max(i, prev[s.charAt(i)]);
            int maxEnd= j-1+1;
            res= Math.max(res,maxEnd);
            prev[s.charAt(i)]=j;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abcadbd";
        System.out.println("long dis is ->"+longDis(s));
    }

}
