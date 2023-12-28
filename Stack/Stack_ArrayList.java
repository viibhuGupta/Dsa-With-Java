import java.util.ArrayList;
import java.util.Stack;
public class Stack_ArrayList {

    static class stack {

        static ArrayList<Integer> list = new ArrayList<>();
        // to check if Array List is Empty
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        // push
        public static void push(int data){
            list.add(data);

        }

        //pop
        public static int pop(int data){
            // if Stack is Empty 
            if (isEmpty()) {
                return -1;
            }

            int top = list.get(list.size() - 1); // Array list last element chahiye
            list.remove(list.size() - 1); // that remove the last element
            return top;
        }

        // peek

        public static int peek(int data) {
              // if Stack is Empty 
            if (isEmpty()) {
                return -1;
            }

            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}
