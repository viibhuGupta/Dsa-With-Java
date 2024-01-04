#include <iostream>
using namespace std;
class Node{
    public:
    int data;
    Node* next;
    // Constructer function
    Node(int data){ // calling this to main
        this-> data = data;
        this -> next = NULL;
    }
    // Destructor function
    ~Node(){
        int value = this -> data;
        // memory free
        if (this -> next != NULL)
        {
            delete next;
            this -> next = NULL;
        }
        cout<< "Memory is Free for Node with Data: "<< value<<endl;
    }  
};
//  insertation at head
void InsertationAtHead(Node* &head , int data){
    // Create a new Node
    Node* newNode = new Node (data);
    newNode -> next = head;
    head = newNode; 
};
// Insert at the end of the ll
void InsertAtTail(Node* &tail , int data){
    // Create a new Node
    Node* newNode = new Node(data);
    tail ->next= newNode;
    tail = newNode;
}
//traverse of Node
void PrintNode(Node* & head){
    // create a pointer that target the head node to print
    Node* temp = head;
    while (temp != NULL)
    {
        cout<<temp -> data << " ";
        temp = temp->next; // temp ko aage badha rahe hai
    }
    cout<<endl;   
}
//  Delete the Node
void DeleteNode(Node* &head , int position){
    // delete the first node
    if (position == 1)
    {
        Node* temp = head;
        head = head -> next;

        // memory free
        temp ->next = NULL;
        delete temp;
    }
    // delete the last and middle Node
    else{
        // delete any middle node
        Node* curr = head;
        Node* prev = NULL;
        int cint = 1;
        while (cint < position)
        {
            prev = curr;
            curr = curr->next;
            cint++;
        }
        prev -> next = curr ->next;
        curr -> next = NULL;
        delete curr;
        }
    }

int main(){
    // craete a new node
    Node* node1 = new Node(10);
    // cout<<node1 -> data << endl;
    // cout<< node1 -> next<<endl;
    //HEAD POINTER TO NODE
    Node* head = node1;
    Node* tail = node1;
    PrintNode(head);
    // inserting 2nd node
    InsertationAtHead(head , 12);
    PrintNode(head);
    //  inserting 2nd node
    InsertationAtHead(head,15);
    PrintNode(head);
    // inserting At last node
    InsertAtTail(tail,20);
    PrintNode(head);
    //  delete FIRST node
    DeleteNode(head,4);
    PrintNode(head);
return 0;
}