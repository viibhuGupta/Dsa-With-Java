import java.util.Arrays;

public class ChocolateDistrbuation {

    /*  
    
    Link : https://www.geeksforgeeks.org/chocolate-distribution-problem/
     
    */

    public static void findNumer(int n){
        
    }
    
    static int findMinChocolateDistributionDiff (int arr[]  , int m){

        int n = arr.length;

        // if there is no student and and chocolate packets 

        if (m == 0 || n == 0) {
            return 0;
        }

        //  Sort the Array 
        Arrays.sort(arr);

        // No of the    students can not be more than chocolates packets

        if (n < m) {
            return -1;
        }

        // Largest Number of the Chocolates Pckets
        // this code represent the last element and the first element minim difference
        int min_Diff = Integer.MAX_VALUE;
        

        for (int i = 0 ; i + m - 1  < n ; i++){  

            int subArrDiff = arr[i + m -1] - arr[i];

            if (subArrDiff < min_Diff) {
                min_Diff = subArrDiff;
            }


        } return min_Diff;



    }

    public static void main ( String arg[]){
        int arr [] = { 12, 4,  7,  9,  2,  23, 25, 41, 30,
            40, 28, 42, 30, 44, 48, 43, 50 };

            int m = 7;
            int n = arr.length;

            System.out.println("Maximum Difference : "+findMinChocolateDistributionDiff(arr, m));
    }


}
