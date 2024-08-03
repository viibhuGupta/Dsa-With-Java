package Array.problem;

import java.util.Arrays;

public class reverseArray {

    static void reverseArray(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
    };

    static void reverseSubArray(int arr[], int leftElement, int rightElement) {
        int n = arr.length;
        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (leftElement == arr[i]) {
                leftIndex = i;
            }
            if (rightElement == arr[i]) {
                rightIndex = i;
            }
        }

        // for (int i = 0; i <= (rightIndex - leftIndex) / 2; i++) {
        // int leftPos = leftIndex + i;
        // int rightPos = rightIndex - i;
        // int temp = arr[leftPos];
        // arr[leftPos] = arr[rightPos];
        // arr[rightPos] = temp;
        // }

        while (leftIndex < rightIndex) {
            int temp = arr[leftIndex];
            arr[leftIndex] = arr[rightIndex];
            arr[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }

        // Print the modified array
        for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

  public  static void reverseSubArray3(int arr[], int leftElement, int rightElement){
        for (int i = 0; i < leftElement - 1; i++) {
            System.out.print(arr[i]);
        }
        for (int i = rightElement  -1; i >= leftElement -1; i--) {
            System.out.print(arr[i]);
        }
        for (int i = rightElement; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }


    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        // reverseArray(arr);
        System.out.println(Arrays.toString(arr));

        reverseSubArray(arr, 2, 4);
        System.out.println();
        reverseSubArray3(arr, 2, 4);

    }
}
