package Array;

public class SecondLargest {

    public static int largest(int arr[]){
        int max =0;
        int n= arr.length;
        for(int i=1; i<n-1; i++){
            if(arr[i]<arr[i+1])
                max = arr[i+1];
        }
        return max;
    }

    public static int secondLarge(int arr[],int largest){

        int res =-1;
        int n= arr.length-1;
        for(int i=0; i<n; i++){
            if(arr[i] > largest) {
                res = largest;
                largest = arr[i];
            }
                else if(arr[i]>res && arr[i] != largest) {
                    res = arr[i];
                }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] ={10,20,3,2,1,30};
        int largestCall = largest(arr);
        System.out.println("Largest No is -> "+largestCall);
        System.out.println("second largest -> "+secondLarge(arr,largestCall));
    }
}
