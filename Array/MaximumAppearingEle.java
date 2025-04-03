package Array;
/*
Suppose you have given to array
Left [ 1 2 ]
right [5 4 ]
here you have given range of two array means
from left 1 and right 5 so your array become
[1 2 3 4 5 ]
and second range
[2 3 4 ]
You need to find most element occurence in array
which is 2 here.
not working code
 */
public class MaximumAppearingEle {

    public static int maxNum(int left[], int right[]){
        int fre [] = new int[100];
        for(int i=0; i<100; i++){
            fre[left[i]]++;
            fre[right[i]+1]--;

        }

        int res =0;
        for(int i=0; i<100; i++){
            fre[i] = fre[i-1] + fre[i];
            if(fre[i]>fre[res]){
                res=i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int left[]={1,2,4};
        int right[]={4,5,7};
        System.out.println("Most occurence -> "+maxNum(left,right));
    }
}
