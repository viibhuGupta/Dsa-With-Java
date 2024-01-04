#include <iostream>
using namespace std;

class palidrome{
  public :
    int helper(string s , int start,int end){
        if (s[start] >= s[end]){
            //  it is not palidrom because first last last index is not equal
            return 1;

        }


        if (s[start] != s[end])
        {
           
            return -1;
        }

        return helper(s,start+1,end -1); 
        
    }

    int isPalidrom(string S){
        int n = S.size() -1;
        int result = (S,0,n);
        return result;  
    }

};



int main(){

palidrome d ;
d.isPalidrom("vibhu");

   

}