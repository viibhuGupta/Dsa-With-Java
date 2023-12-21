package Java.LinkList;

import java.util.LinkedList;

import Java.LinkList.Create_LinkedList.Node;

public class AddFirst_In_linkedList {

    public static Node head;
    public static Node tail;

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
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addLast(2);

    }
    
}
