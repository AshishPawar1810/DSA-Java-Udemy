package Array;
/*
Count repreation of one in array
 */
public class MaxConscutiveOnes {

    public static int countONe(int arr[]){
        int n= arr.length;
        int count =0;
        for(int i=0; i<n; i++){
            if(arr[i]==1){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] ={0,0,1,1,1,1,0,5,6};
        System.out.println("Count of 1 -> "+countONe(arr));
    }
}
