#include <iostream>
using namespace std;
class Node{
    public:
    int data;
    Node* right;
    Node* left;
    Node(int data){
        this->data = data;
        this->right = NULL;
        this->left = NULL;
    }
};
Node* buildTree(Node* root){
    cout<<"Enter the Data : "<<endl;
    int data;
    cin >> data;
    root = new Node(data);
    if (data == -1)
    {
        return NULL;
    }
    cout<<"Enter the Data for inserting in left  : "<<endl;
    root-> left = buildTree(root->left);
    
    cout<<"Enter the Data for inserting in Right  : "<<endl;
    root-> left = buildTree(root->left);
    return root;
}
int main (){
    Node* root = NULL;
    // create the tree
    root = buildTree(root);

}