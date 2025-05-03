package Sorting;
/*
print unique array
two sorted array give

 */
public class UnionOfTwoSortedArray {

    public static void unionTwo(int first[], int sec[]){
        int n1=first.length;
        int n2=sec.length;

        int i=0; int j=0;

        while(i<n1 && j<n2){
            if(i>0 && first[i]==first[i-1]) {
                i++;
            }
            else if(j>0 && sec[j]==sec[j-1]){
                j++;
            }
            else if (first[i]<sec[j]) {
                System.out.print(" "+first[i]);
                i++;
            }
            else if(sec[j]<first[i]) {
                System.out.print(" " + sec[j]);
                j++;
            }
            else {
                System.out.print(" " + first[i]);
                i++;
                j++;
            }
        }

        while(i<n1){
            if(i>0 && first[i]!=first[i-1]){
                System.out.print(" "+first[i ]);
                i++;
            }
        }

        while(j<n2){
            if(j>0 && sec[j]!=sec[j-1]){
                System.out.print(" "+sec[j]);
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int first[]={2,10,20,20};
        int sec[]={3,20,40};
        unionTwo(first,sec);
    }
}
