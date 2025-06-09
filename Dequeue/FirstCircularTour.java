package Dequeue;

public class FirstCircularTour {

    public static int firstPetrolPumt(int petrol[], int dist[]){
        int pn=petrol.length;
        int dn=dist.length;

        int start=0; int currPet =0; int prevPet =0;
        for(int i=0; i<dn; i++){
            currPet += petrol[i]+dist[i];
            if(currPet<0){
                start=i+1;
                prevPet += currPet;
                currPet=0;
            }
        }
        return ((currPet+prevPet)>0) ? (start+1) : -1;
    }

    public static void main(String[] args) {
        int petrol[]={50,10,60,100};
        int dist[]={30,20,100,10};
        System.out.println("answer is -> "+firstPetrolPumt(petrol,dist));
    }
}
