#include <iostream>
using namespace std;

class Animal{

  public :  void Dog (){
    cout<<"Dog is Barking";
  } 

};

class Cat : public Animal{


};

class A {

};

class B : A {

};
class c : B{

};

//  multilevel inheritance
class shape{
    //  write code for shape
};

class circle : shape{

};

class squire : shape{

};

// multilevel
class a {

};
class b {

};
class c : a ,b{

};

//  Base class and Drived class
class Animal2{
    string spacies;

    void makeSound(){
        cout<<"Dog is Barking"<<endl;
    }
};

// drived class
class Dog : public Animal2{
    // spacify the inherited properties
        string bread;

        void bark(){
            cout<<"woof woof"<<endl;
        }
};

 class hy{

    public : 
    int data ;
    int hello;

};

void updateValue(int x){
     x=x+1;
}

void updateArr(int arr[]){
    arr[0]=arr[0]+1;
};

class operatorOverLoadig{

    int operater(int a , int b){
    return a+b;
    }
    int operater()
}


int main (){
    int number = 5;


    int arr[] = {10,22,25};



    
}