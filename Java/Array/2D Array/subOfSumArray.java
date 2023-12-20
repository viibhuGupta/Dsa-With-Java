import java.util.Scanner;

public class subOfSumArray {

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
   

   
   int nums [] = {-1};

    int result = subArraysum(nums);
   
    System.out.println(result);
}
}
