public class Practice {

    public class LinkedList{
        // Create a Node  Class
        public static class Node{
            int data ; // store the value
            Node Next; // Stote the Reference and address of Node

            public Node(int data){
                this.data = data;
                this.Next = null;
            }
        }

        public static Node head;
        public static  Node tail;

        public  void AddFirst(int data){
            // create a new Node 
            Node newNode = new Node(data);

             // Step 2: if head is Empty then
             if (head == null) {
                head = tail = newNode;
                return;
             }

              // step 3:   newNode next = head
              newNode.Next = head;
                // Step 4: head = newNode
                head = newNode;
        }


        public static void main(String[] args) {
            LinkedList ll = new LinkedList();
            
        }

    }
    
}
