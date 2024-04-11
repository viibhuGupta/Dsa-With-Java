
/* https://www.geeksforgeeks.org/problems/max-min/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article */
package Array;

public class sumOFMIN_Max {
    public static int minMaxSum(int arr[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int sum = max + min;
        return sum;
    }

    // Optomize Code 
    public static int OptimizeMinMaxSum(int arr[]) {
    int min = arr[0];
    int max = arr[0];

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        } else if (arr[i] < min) {
            min = arr[i];
        }
    }
    return max + min;
}

    public static void main(String[] args) {
            int arr [] = {1, 3, 4, 1};
            int ans = minMaxSum(arr);
            System.out.println("Sum of Max and Min is : "+ans);
        
    }
}
