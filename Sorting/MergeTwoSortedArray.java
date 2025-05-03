package Sorting;
/*
Merge sort is divide and conqore algoritham
Stable algoritham
time complexity is O(nlog n)
array are sorted in sub partion
IN this problem two sorted array given

 */
public class MergeTwoSortedArray {

    public static void mergeTwo(int first[], int sec[]){
        int n= first.length;
        int m = sec.length;
        int i=0;int j=0;

        while(i<n && j<m){
            if(first[i]<sec[j]){
                System.out.print(" "+first[i]);
                i++;
            }else{
                System.out.print(" "+sec[j]);
                j++;
            }
        }

        while(i<n){
            System.out.print(" "+first[i]);
            i++;
        }

        while(j<m){
            System.out.print(" "+sec[i]);
            j++;
        }
    }

    public static void main(String[] args) {
        int first[]={11,10,20,50};
        int sec[]={12,5,15,25};
        mergeTwo(first,sec);
    }
}
