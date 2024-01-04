#include <iostream>
using namespace std;
class Node{
    // creating node
    public:
    int data;
    Node* next;
    Node(int data){
        this->data = data;
        this-> next= NULL;
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
int main(){
    // creating a new Node
    Node* node1 = new Node(10);
    Node* head = node1 ;
    cout<<node1 -> data << endl;
    cout<< node1 -> next<<endl;   
}