import java.lang.reflect.Array;
import java.util.*;


/* https://leetcode.com/problems/contains-duplicate/description/ */

public class ContainDuplicates {

    static boolean isContainDuplicates (int arr[]){

        //  the time Compelicty of this code is O(n^2) time 

        for( int i =0 ;  i< arr.length ; i++ ){
            for( int j = i+ 1 ; j< arr.length ; j++){
               if (arr[i] == arr[j]) {
                return true;
                
               }
            }

        } return false;
    }



    // Using Sorting 

    static void isContainDuplicatesSort(int nums[]){
        // first Sort the Array
        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length - 1 ; i++){  //  i < nums.length - 1  because this not go to check for out of boud to next index

            if (nums[i] == nums[i+1])  {
                
                System.out.println("Repeat number Exists : " + nums[i]);
                break;
                
            }
            else{
                System.out.println("Repeat number not Exists" );
                break;
            }
        } 

    }



    public static void main(String[] args) {

            int num [] = {1,2,3,4,8 ,1};
            
            
            System.out.println(isContainDuplicates(num));

           
            isContainDuplicatesSort(num);


            
    }
    
}
