package stack;

public class ImplementTwoStackArray {

    public static class twoStackImpl{
        int arr[];
        int cap;
        int top1;
        int top2;

        public twoStackImpl(int n) {
            this.arr = new int[n];
            this.cap = n;
            this.top1 = -1;
            this.top2 = n;
        }

        boolean push1(int x){
            if(top1<top2-1){
                top1++;
                arr[top1]=x;
                return true;
            }
            return false;
        }

        boolean push2(int x){
            if(top1<top2-1){
                top2--;
                return true;
            }
            return false;
        }

        int pop1(){
            if(top1>0){
                int x=arr[top1];
                top1--;
                return x;
            }
            return -1;
        }

        int pop2(){
            if(top2<cap){
                int x=arr[top2];
                top2++;
                return x;
            }
            return -1;
        }
    }

    public static void main(String[] args) {

    }
}
