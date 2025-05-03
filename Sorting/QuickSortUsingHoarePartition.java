package Sorting;
/*
Here hovarPart function
divde a array into two part
left and right
it returns index of smallest element at left side
then mark as pivot
and every elemnt compare with pivot
if it is smaller than pivot than shifted to left
or else shifted at right
 */
import java.util.Arrays;

public class QuickSortUsingHoarePartition {

    public static int hovarePart(int arr[], int low, int high){
        int pivot = arr[low];
        int i = low - 1, j = high + 1;

        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j)
                return j;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void sort(int arr[], int low, int high){
        if(low<high){
            int p = hovarePart(arr,low,high);
            sort(arr,low,p);
            sort(arr,p+1,high);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,3,8,4,2,7,1,10};
        int low=0;
        int high=arr.length-1;
        sort(arr,low,high);
        System.out.println(Arrays.toString(arr));
    }
}
