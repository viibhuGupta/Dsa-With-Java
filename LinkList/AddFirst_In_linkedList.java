// package Java.LinkList;

import java.util.LinkedList;

// import Java.LinkList.Create_LinkedList.Node;

public class AddFirst_In_linkedList {

    public static Node head;
    public static Node tail;

    static class Node {
        int data ;
        Node Next;

        public Node (int data) {
            this.data = data;
            this.Next =null;
        }
    }

    public void addFirst ( int data ){

        //  Step 1: To create a new node
        Node newNode = new Node(data);

        // Step 2: if Node is Empty then
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 3:   newNode next = head
        newNode.Next = head; // Link the head to tail

        // Step 4: head = newNode
        head = newNode;
    }

    public static void main (String[] args) {
       AddFirst_In_linkedList ll = new AddFirst_In_linkedList();

        ll.addFirst(1);
       

    }
    
}
