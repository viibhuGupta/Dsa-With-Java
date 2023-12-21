package Java.LinkList;

import java.util.LinkedList;

import Java.LinkList.Create_LinkedList.Node;

public class Print_LinkedList {

    public static Node head;
    public static Node tail;

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

    public void printLL(){
        if (head == null) {
            System.out.println("head is null");
            return;
        }

        Node temp = head;
        while (head != null) {
            System.out.print(temp.data+"->");
            temp = temp.Next;
        }
        System.out.println();

    }

    public static void main (String arg[]){
        LinkedList ll = new LinkedList();

        ll.addFirst();
        ll.printLL();
        ll.addFirst(1);
        ll.printLL();
        

        
    }
    
}
