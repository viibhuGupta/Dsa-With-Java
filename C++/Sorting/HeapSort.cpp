#include <iostream>
using namespace std;
void heapSort(int arr , int n , int i){
    int large = i;
    int l = 2*i;
    int r = 2*i+1;

    if (l<=n && arr[l] > arr[large])
    {
        large = l;
    }
    if (r<= n && arr[r] < arr[large])
    {
       large = r;
    }
    if (large != i)
    {
        swap(arr,i,large);
        heapSort(arr,n,large);
    }
    
}