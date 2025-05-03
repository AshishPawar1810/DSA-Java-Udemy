package Sorting;

import java.util.Arrays;

/*
in this type of problem you have given an array
of time for a party
at specific time how many people are there you can meet
 */
public class MeetingMaximumGuest {

    public static int maxMeet(int first[], int sec[]){
        int n1=first.length;
        int n2= sec.length;
        Arrays.sort(first);
        Arrays.sort(sec);

        int i=1; int j=0; int res=1; int curr=1;

        while(i<n1 && j<n2){
            if(first[i]<=sec[j]) {
                curr++;
                i++;
            }
            else {
                curr--;
                j++;
            }
            res=Integer.max(res,curr);
        }
        return res;
    }

    public static void main(String[] args) {
        int arrival[]={900,600,700};
        int departure[]={1000,800,730};

    }
}
