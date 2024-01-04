#include <iostream>
using namespace std;

 int binarySearch(int arr[] ,int size, int key){
    int start = 0;
    int end = size - 1;
    int mid = start +  (start - end) / 2; 
   while (start <= end)
   {
    if (arr[mid] == key)
    {
        return mid;
    }
    // right part
    if (key > arr[mid])
    {
        start= mid+1;
    }
    else{
        end = mid - 1;
    }
    mid = (start + end) / 2;
   }
   return-1;   
}

int main (){
    int arr[5] = { 4 , 6, 2 ,9,12};
    int arr2[5] = { 3 , 5, 7, 9, 11 };

    int even = binarySearch(arr,5,9);
    cout<< "Even :"<<even;

    int odd = binarySearch(arr2,5,5);

}