import java.util.Scanner;

/* https://leetcode.com/problems/maximum-subarray/description/ */

public class maxSubArray {

    public static int subArraysum (int arr[] ){
    int maxSum = 0;
    int curSum = 0 ;

    for(int i = 0; i < arr.length; i++){

        curSum += arr[i]; // curSum = curSum + arr[i]

        if (curSum > maxSum) {
            maxSum = curSum;
        }
        if (curSum < 0) {
            curSum = 0 ;
        }
      

    } return maxSum;
}


public static void main ( String arg []){
   

   // when i am tring to give -1 its return 0 but the need output is 1
   int nums [] = {-2,1,-3,4,-1,2,1,-5,4};


    int result = subArraysum(nums);
   
    System.out.println(result);
}
}
