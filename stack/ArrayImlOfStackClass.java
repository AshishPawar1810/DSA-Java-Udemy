package stack;

import javax.jnlp.ClipboardService;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class ArrayImlOfStackClass {

    public static class myStack {
        ArrayList<Integer> list = new ArrayList<>();

        public void push(int x) {
            list.add(x);
        }

        public int pop(int x) {
            int res = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return res;
        }

        int peek(){
            return list.get(list.size()-1);
        }

        boolean isEmpty(){
            return list.isEmpty();
        }

        int size(){
            return list.size();
        }
    }

    public static void main(String[] args) {

    }
}
