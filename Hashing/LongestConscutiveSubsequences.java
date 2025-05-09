package Hashing;

import java.util.HashSet;

/*
In such type of problem you have given array of random element
it should form number sequence
we need to find logest sequence
eg [1 9 3 4 2 20]
longest subsequesce is
[1 2 3 4]
o/p is 4 length of array
 */
public class LongestConscutiveSubsequences {

    public static int sequenceCount(int arr[]){
        HashSet<Integer> hs = new HashSet<>();
        for(int x : arr){
            hs.add(x);
        }
        int res=1;
        for(int x: hs   ){
            if(hs.contains(x-1)==false){
                int curr=1;
                while(hs.contains(x+curr)){
                    curr++;
                }
                res = Math.max(curr,res);
            }
        }
        return  res;
    }

    public static void main(String[] args) {
        int arr[]={1,3,9,2,8};
        System.out.println("Longest sequence is -> "+sequenceCount(arr));
    }
}
