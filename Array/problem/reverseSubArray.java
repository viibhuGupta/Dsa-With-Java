package Array.problem;

public class reverseSubArray {
    public static void main(String[] args) {
        
    }

    static void reverseSubArray(int arr[] , int leftElement , int rightElement ){
        int leftIndex = 0 ;
        int rightIndex = 0;

        for (int i = 0; i < arr.length; i++) {
           if (leftElement == arr[i]) {
            leftIndex = i;
           }
           if (rightElement == arr[i]) {
            rightIndex = i;
           }
        }


        for (int i = 0; i < (rightIndex - leftIndex + 1) / 2; i++) {

        int leftPos = i + leftIndex;
        int rightPos = rightIndex + i;
        int temp = arr[leftPos];
        arr[leftPos] = arr[rightPos];
        arr[rightPos] = temp;
        
        }
    }
}
