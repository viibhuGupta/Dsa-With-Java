#include <iostream>
using namespace std;

void selectionSort(int arr[],int n){
    

    for (int i = 0; i < n; i++)
    {
        int minIndex = i;
       
       for (int j = i; j < n; j++)
       {
        if (arr[j] < minIndex)
        {
            minIndex = j;
        }
        
       } 
       swap(arr[minIndex],arr[i]);
       
    }
    
}

int main(){
    int arr[6]={7,2,9,11,3,8} ;

  selectionSort(arr,6);
   
   for (int i = 0; i < 6; i++)
   {
    cout<<arr[i]<<" ";
   }
   
   return 0;
}