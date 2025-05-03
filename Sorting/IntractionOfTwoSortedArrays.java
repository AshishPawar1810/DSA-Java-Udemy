package Sorting;
/*
this type of problem you need to check duplicate element in two given array
you have to print them only once.
this only work in two sorted array

 */
public class IntractionOfTwoSortedArrays {

    public static void interSection(int a[], int b[]){
        int na  = a.length;
        int nb = b.length;

        int i=0; int j=0;
        while(i<na && j<nb){
            if(i>0 && a[i]==a[i-1]){
                i++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else if(b[j]<a[i]){
                j++;
            }else{
                System.out.print(a[i]+" ");
                i++; j++;
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {10,20,20,30,40,60};
        int b[]= {2,20,20,20,30};
        interSection(a,b);
    }
}
