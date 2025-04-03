package Array;
/*
Leader in array means a array element which do not have greater element of it at right position
right side la jar motha element asla tr leader nahi from its position
ex {7,10,4,10,6,5,2}

 */
public class LeaderInArray {

    public static void leaderArray(int arr[]) {
        int n= arr.length;
        int curr_ind = arr[n-1];

        System.out.print(curr_ind);

        for(int i= n-2; i>=0; i--){
            if(curr_ind <arr[i]){
                curr_ind=arr[i];
                System.out.print(" "+curr_ind);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {7,10,4,10,6,5,2};
        leaderArray(arr);

    }
}
