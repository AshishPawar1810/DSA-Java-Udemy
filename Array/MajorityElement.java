package Array;
/*
Majaority of element can be considered as n/2 times
where n is size of array
if array lenght is 5 then it should be appear 3 times in array.
 */
public class MajorityElement {

    public static int majEle(int arr[]){
        int res =0;
        int count =1;
        int n= arr.length;
        for(int i=1; i<n; i++){
            if(arr[res]==arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                res=i;
                count=1;
            }
        }

        count=0;
        for(int i=0; i<n; i++){
            if(arr[res]==arr[i]){
                count++;
            }
            if(count <n/2){
                res =0;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {8,8,6,6,6,4,6};
        System.out.println("occurence count -> "+majEle(arr));

    }
}
