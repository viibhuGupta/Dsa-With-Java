

public class Stack_Using_LinkedList {
    //  Create a Node
    static class  Node {
        int data;
        Node next;

        // constructor for node
        Node (int data){
            this.data = data;
            this.next = null;
        }
    } 

    // create a Stack
    static class Stack{
        static Node head = null; // head is init by null

        //if LinkList Stack is empty
        public static boolean isEmpty(){
            return head == null;
        }

        // push Using LinkedList
        public static void push (int data ){
            Node newNode = new Node (data);

            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        } 

        // pop using LinkedList
        public  static int pop(){
            if (isEmpty()) {
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        // peek
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return head.data;
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
