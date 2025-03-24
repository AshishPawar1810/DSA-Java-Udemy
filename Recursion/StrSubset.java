package Recursion;
/*
In below problem we are making possible subset of given string
2 Resto n-1 possible subset
where n is length of string

 */
public class StrSubset {

    public static void subset(String str, String curr, int i){
        if(i== str.length()){
            System.out.print(curr+" ");
            return;
        }

        subset(str, curr, i+1);
        subset(str,curr+(str.charAt(i)),i+1);


    }
    public static void main(String[] args) {
        String str ="ABC";
        int index =0;
        String curr = "";
        subset(str,curr,index);

    }
}
