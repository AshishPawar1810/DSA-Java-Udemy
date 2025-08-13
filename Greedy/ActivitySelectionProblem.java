package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
Active selection problem :
Maximum number of activities that can be happen
on a single tasking machine
In this type of problem you have given two array pair
first represent start time
second represent end time
eg {(2,3),(1,4)}
for first value
start time is =2
 end time is = 3

 multiple values you have given
 time value should not overlap on each other
 we can not pick that

 */
public class ActivitySelectionProblem {

    public static class Activity{
        int start;
        int end;

        public Activity(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static int maxActivity(Activity arr[]){
        Arrays.sort(arr, Comparator.comparingInt(a ->a.end));
        int res=1;
        int prev=0;

        for(int curr=1; curr<arr.length; curr++){
            if(arr[curr].start >= arr[prev].end){
                res++;
                prev=curr;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Activity arr[] = {new Activity(12,25),
                        new Activity(10,20),
                        new Activity(20,30)};
        System.out.println("Max work can be done -> "+maxActivity(arr));



    }
}
