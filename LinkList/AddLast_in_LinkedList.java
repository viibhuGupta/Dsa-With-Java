// package Java.LinkList;

import java.util.LinkedList;

// import Java.LinkList.Create_LinkedList.Node;

public class AddLast_in_LinkedList {
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

    public static void main(String[] args){
        LinkedList ll = new LinkedList();

        ll.addLast(1);

    }
}
