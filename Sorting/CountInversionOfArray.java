package Sorting;
/*
A pair of array arr[i] arr[j]
form an inversion when i<j
Means A greater element occurs before smaller element
o/p not working
 */
public class CountInversionOfArray {

    public static int countAndMerge(int arr[], int low, int mid, int high){
        int n1= mid-low+1;
        int n2= high-mid;
        int first[]=new int[n1];
        int sec[]=new int[n2];

        for(int i =0; i<n1; i++ ){
            first[i]=arr[low+i];
        }

        for(int j=0; j<n2; j++){
            sec[j]=arr[mid+j+1];
        }

        int i=0; int j=0; int k=low; int res =0;

        while(i<n1 && j<n2){
            if(first[i]<=sec[j]){
                arr[k]=first[i]; i++;
            }
            else{
                arr[k]=sec[j]; j++;
                res= res +(n1-i);

            }
            k++;
        }

        while(i<n1){
            arr[k]=first[i]; i++; k++;
        }

        while(j<n2){
            arr[k]=sec[j]; j++; k++;
        }

        return res;
    }

    public static int mergeSort(int arr[], int low, int high){
        int res=0;
        int mid= low+(high-low)/2;
        if(low<high){
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            countAndMerge(arr,low,mid,high);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={2,5,8,11,3,6,9,13};
        int low=0;
        int n= arr.length;
        int high = n-1;
        System.out.println("Result is -> " +mergeSort(arr,low,high));
    }
}
