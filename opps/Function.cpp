#include <iostream>
using namespace std;

class circle {
    private:
    float radius;

    public : void enterRadius(){
        cout<<"Enter radius :" << endl;
        cin >> radius;
    }  

   public: void area(){
    float a = 3.14 *(radius * radius);
    cout<< "Area : " << a;
   }  

};

class rectangle {
 private:
  int length , width;

public : void getdata(){
     cout<<"Enter the length :"<<endl;
    cin>>length; 

     cout<<"Enter the width :"<<endl;
    cin>>width;
    
 };

 void area();
    
};

void rectangle :: area(){
int result = length * width;
cout<<"Area of rectangle :" << result;
};


//  friend functions class

class Addition{
    int a , b;

    public : void getData(){
        cout<<"Enter the a :";
        cin>>a; 

        cout<<"Enter the b :";
        cin>>b;

    }

    friend int sum(Addition);

};

int sum(Addition add){
    return (add.a + add.b);

};



int main (){

// circle radius ;
// radius.enterRadius();
// radius.area();

// rectangle area1;
// area1.getdata();
// area1.area();

// frienf class
// Addition input ;
// input.getData();
// int result = sum(input);
// cout<<"Sum of  and b : " <<result; 


    return 0;
};