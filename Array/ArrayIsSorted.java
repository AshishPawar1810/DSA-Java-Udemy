package Array;

public class ArrayIsSorted {

    public static boolean isSorted(int arr[]){
        int n = arr.length;
        for(int i=1; i<n; i++){
            if(arr[i]<arr[i-1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,7,9,1};
        int n=arr.length-1;
        System.out.println("Arr length -> "+arr.length);
        System.out.println("Arr length minus 1 -> "+n);
        System.out.println("Array sorted -> "+isSorted(arr));

    }
}
