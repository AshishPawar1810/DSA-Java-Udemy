package Searching;

public class FindRepeatingSec {

    public static int findRep(int arr[]){
        int n= arr.length;
        int slow = arr[0];
        int fast = arr[0]+1;
        do {
            slow = arr[slow] + 1;
            fast = arr[arr[fast] + 1] + 1;
        }
        while(slow!=fast);
            slow = arr[0] + 1;

        while(slow!=fast) {
            fast = arr[fast] + 1;
            slow = arr[slow] + 1;
        }
    return -1;
    }

    public static void main(String[] args) {
        int arr[] ={0,2,1,3,5,4,6,2};
        System.out.println("Repeating ele is -> "+findRep(arr));

    }
}
