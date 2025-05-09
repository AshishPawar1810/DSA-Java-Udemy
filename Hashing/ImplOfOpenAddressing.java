package Hashing;

public class ImplOfOpenAddressing {

    int arr[];
    int cap,size;

    public ImplOfOpenAddressing(int[] arr, int cap, int size) {
        this.arr = arr;
        this.cap = cap;
        this.size = size;

        for(int i=0; i<cap; i++){
            arr[i]=-1;
        }
    }

    public int hashFun(int key){
        return key % cap;
    }

    public boolean search(int key){
        int h=hashFun(key);
        int i=h;
        while(arr[i]!=-1){
            if(arr[i]==key){
                return true;
            }
            i=(i+1)%cap;
            if(i==h){
                return false;
            }
        }
        return false;
    }

    public boolean insert(int key){
        if(size==cap){
            return false;
        }
        int i= hashFun(key);
        while(arr[i]!=-1 && arr[i]!=-2 && arr[i]!=key){
            i=(i+1)%cap;
        }
        if(arr[i]==key){
            return false;
        }else{
            arr[i]=key;
            size++;
            return true;
        }
    }

    public boolean eraseFun(int key){
        int h= hashFun(key);
        int i=h;
        while(arr[i]!=-1){
            if(arr[i]==key){
                arr[i]=-2;
                return true;
            }
            i=(i+1)%cap;
            if(i==h){
                return false;
            }
        }
        return false;
    }
}
