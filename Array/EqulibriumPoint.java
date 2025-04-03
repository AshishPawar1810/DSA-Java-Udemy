package Array;
/*
A point on element which gives sum of left or right side element
arr[3 4 8 -9 20 6}
3+4+8-9=6
20 is equilibrium point
 */
public class EqulibriumPoint {

    public static boolean ePoint(int arr[]){
        int rs =0;
        int n= arr.length;
        for(int i=0; i<n; i++){
            rs += arr[i];
        }
        int ls=0;
        for(int i=0; i<n; i++){
            rs -= arr[i];
            if(ls==rs){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={3,4,8,-9,9,7};
        System.out.println("Equlibirum point ->"+ePoint(arr));
    }

}
