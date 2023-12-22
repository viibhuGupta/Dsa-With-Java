public class Search_Element_in_Rotated_Array {

    /* https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/1125071933/ 
     * 
     * this code not work with [3,1] , target = 1 ;
     * 
     * https://practice.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1?page=1&difficulty[]=-1&category[]=Arrays&sortBy=submissions
     */

    static int searchElement(int nums[] , int target){

     int low = 0; // first index
     int high = nums.length - 1; // last index
     
     // Start a looping 
     while (low <= high) {
        int mid = (low + high) /2;

        // what if the mead point is equal to target
        if (nums[mid] == target) {
            return mid; // fund the index of target Element
        }

        // this is for right side of element search
        if (nums[low] < nums[mid]) {
            if (target >= nums[low] && target < nums[high]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        // This is used for left side of Element Finding
        else{
            if (target > nums[mid] && target <= nums[high]) {
                low = mid + 1;
            }
            else{
                high = mid -1 ;
            }
        }
     }

    
return -1;
    }

    

    static int searchElement2(int arr[]  ,int  X){
        for (int i = 0 ; i <= arr.length ; i++){

              if(arr[i] == X ){
                return i;   // i return index and arr[i] return Element index   
              }

          }
          return -1;
      }

    



    public static void main (String arg[]){
        int nums[] = {3,1,9};
        int target = 3;

        System.out.println(searchElement(nums, target));
        System.out.println(searchElement2(nums, target));
    }
    
}
