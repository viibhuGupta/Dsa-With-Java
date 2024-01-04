#include <iostream>
using namespace std;

class Node{
    public:
    int data;
    Node* next;
    // Constructer function
    Node(int data){
        this-> data= data;
        this-> next= NULL;
    }
};
class Stack{
public:
    Node* head = NULL;
// if our stack is empty
    bool isEmpty(){
        return head == NULL;    
    }
    // push if not emapty
    void push (int data){
        // creating a new Ndde of Stack
        Node* newNode = new Node(data);
        if (isEmpty())
        {
            head = newNode;
            return;
        }
        newNode -> next = head;
        head = newNode; }
        //pop
        int pop(){
        if (isEmpty())
        {
            return -1;
        }
        int top = head-> data;
        Node* temp = head;
        head = head-> next;
        delete temp;
        return top;  
    }
    //peek
    int peek(){
        if (isEmpty())
        {
            return -1;
        }
        return head-> data;      
    }
};
int main(){
    Stack s;
    s.push(1);
    s.push(2);
    s.push(3);
    // printthis
    while (!s.isEmpty())
    {
        cout<<s.peek()<<endl;
        s.pop();
    }
    return 0;
}
