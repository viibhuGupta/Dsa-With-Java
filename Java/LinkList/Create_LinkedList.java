package Java.LinkList;

import java.util.LinkedList;

public class Create_LinkedList {
    
  public  static class Node {   // function and class name is same that is called constructor -> 
    // Constructor is use to create a new instance and destructer is used to delete that instance

    int data ;
    Node Next ;

    // Create a function that
    public Node(int data){
        this.data = data;
        this.Next = null;
    }

    }

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



    public static void main (String arg[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(l);
    }
}
