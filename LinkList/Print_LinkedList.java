package Java.LinkList;

import java.util.LinkedList;

import Java.LinkList.Create_LinkedList.Node;

public class Print_LinkedList {

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
    public void addFirst(int data ){

        //  new node init
        Node newNode = new Node(data);

        // step 2 
        if (head == null) {
            head = tail = newNode;
            return;
            
        }

        // step 3
        newNode.Next  = head;

        head = newNode;
    }

    public void addLast(int data ){
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.Next = newNode;

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

    public static void main (String arg[]){
        Print_LinkedList ll = new Print_LinkedList();

        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(2);
        ll.print();



        
    }
    
}
