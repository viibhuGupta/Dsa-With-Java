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

    public static void main (String arg[]){
        LinkedList ll = new LinkedList();
    }
}
