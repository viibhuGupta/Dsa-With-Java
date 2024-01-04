#include <iostream>
using namespace std;

int divide(int a , int b){
   if (b == 0)
   {
    throw  runtime_error("Can't divided by 0 ");    
   }
  return a/b; 
}

int main(){
    

    try
    {
        int result = divide(10,2);
         cout << "result : "<<result << endl;
    }
    catch(const runtime_error& e)
    {
        cerr <<"Error : "<< e.what() << endl;
    }
    
}