package Array;

public class LargestElement {

    public static int largest(int arr[]){
        int max =0;
        int n= arr.length;
        for(int i=1; i<n-1; i++){
            if(arr[i]<=arr[i+1])
                max = arr[i+1];
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {5,10,2,4,100};
        System.out.println("Largest element -> "+largest(arr));
    }
}
