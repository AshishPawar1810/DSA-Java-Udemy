package stack;

import java.util.Stack;

/*
stack operation:
isEmpty();check stack is empty
push :
pop
peek: return top element
size;
Two condition in stack:
1. Underflow: pop & peek() performed on empty stack.
2. Ooverflow: When push callled on stack full
 */
public class StackDataStructure {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(15);
        st.push(20);
        st.push(35);
        System.out.println("Peek is -> "+st.peek());
        st.pop();
        System.out.println("Peek is -> "+st.peek());
        System.out.println("size is -> " +st.size());
        st.push(5);
        System.out.println("Peek is -> "+st.peek());
        System.out.println("Is empty -> "+st.isEmpty());

    }
}
