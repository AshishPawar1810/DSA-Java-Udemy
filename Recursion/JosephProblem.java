package Recursion;
/*
People are standing in circle
as specific number in cicle people were killed by gun
gun hand over to next person
he kill specific person from his position to given next number people.
 */
public class JosephProblem {

    public static int jos(int n, int k){
        if(n==1)
            return 0;
        return jos(n-1,k);
    }
    public static void main(String[] args) {
        System.out.println("Person Killed -> "+jos(5,3));
    }
}
