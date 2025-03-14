package BitMagic;
/*
in this type of problem we are counting odd occourence of digit in array
eg. {8 8 7 7 7}
8=2 time occourence
7 =3 time occurence so printing 7
 */
public class FindOdd {

    public static int findOdd(int arr[], int n){
        int res = arr[0];
        for(int i=1; i<n; i++){
            res = res ^ arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]   = {8,7,7,7,8};
        int n = arr.length;
        System.out.println("Odd in array - "+findOdd(arr, n));
    }
}
