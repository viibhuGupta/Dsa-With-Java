public class Size_Print_LL {

    public class Node {
        int data;
        Node Next;

        public Node(int data){
            this.data = data;
            this.Next=null;
        } 
    }

    public static Node head;
    public static Node tail;
    public static int size;


    public void addFirst(int data){

        Node newNode = new Node(data);
         size++;
        

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
        size++;

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

    public static void main(String[] args) {
        Size_Print_LL ll = new Size_Print_LL();

        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(2);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addLast(4);
        ll.print();

        System.out.println(ll.size);
        
    }   
    
}
