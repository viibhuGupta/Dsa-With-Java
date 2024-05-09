package Array;

public class BinarySearch {

   public static int getIndexBinary(int arr[], int key) {
      int start = 0;
      int end = arr.length - 1;

      while (start <= end) {
         int mid = start + (end - start) / 2;

         if (arr[mid] == key) {
            return mid;
         }
         if (arr[mid] < key) {
            start = mid + 1;
         } else {
            end = mid - 1;
         }
      }
      return -1; // Return -1 if key is not found in the array
   }
   
      public static void main(String[] args) {

      int arr[] = { -2,4,6,8,10}; // sorted Array
      int key = -2;
      // int ans = getIndex(arr, key);
      System.out.println(getIndexBinary(arr, key));
      

   } 
}
