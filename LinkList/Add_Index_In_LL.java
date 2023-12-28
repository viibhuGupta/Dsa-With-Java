import org.w3c.dom.Node;

public class Add_Index_In_LL {
    
    public static Node head; 
    public static Node tail;

    static class Node {

        int data;
        Node Next;
    
        public Node(int data){
        this.data = data;
        this.Next = null;
    } 

    }

    public void addFirst(int data){

        Node newNode = new Node(data);

        if (head == null) {
            head = tail =newNode;
            return;
        }

        newNode.Next = head;

       head  = newNode;
    }


    public void addLast(int data ){

        // step 1: create a new node
        Node newNode = new Node(data);

        // step 2: check is node is empty 
        if (head == null) {
            head = tail = newNode;
            return ; 
        }
        // step 3: tail.next = newNode
        tail.Next = newNode;

        // step 4: tail = newNode
        tail = newNode;
    }



    public void print(){
        
        if (head == null) {
            System.out.println("head is null");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.Next;
        }
        System.out.println();

    }


    public void addIndex(int index , int data){
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.Next;
            i++;
        }

        newNode.Next = temp.Next;
        temp.Next= newNode;
    }

    public static void main(String[] args) {

        Add_Index_In_LL ll = new Add_Index_In_LL();

        ll.print();
        ll.addFirst(0);
         ll.print();
        ll.addLast(1);
         ll.print();
        ll.addFirst(7);
        ll.print();
        ll.addLast(8);
        ll.print();
        ll.addIndex(2, 12);
        ll.print();
        
    }

}
