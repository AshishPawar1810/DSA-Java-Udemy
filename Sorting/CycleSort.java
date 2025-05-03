package Sorting;

import java.util.Arrays;

/*
Takes less memory bytes
where memory are costly then you can go for cycle sort
In place and not stable
This algoritham check how many elemnts at right side
are smaller
and make left side as sorted
this is cyclic process
 */
public class CycleSort {

    public static void cycleSort(int arr[]){
        int n=arr.length-1;
        for(int cs=0; cs<n-2; cs++){
            int item=arr[cs];
            int pos=cs;
            for(int i=cs+1; i<n; i++){
                if(arr[i]<item){
                    pos++;
                }
            }
            int temp = arr[item];
            arr[item]=arr[pos];
            arr[pos]=temp;

            while(pos != cs){
                pos=cs;
                for(int j=cs+1; j<n-1; j++)   {
                    if(arr[j]<item){
                        pos++;
                    }
                }
                int secTemp = item;
                item=arr[pos];
                arr[pos]=secTemp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={10,20,50,40,30};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
