package Array;

public class ReverseArray {
    public static void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void reverseArrayWithExtraArray(int arr[]){ 
        int extraArray [] = new int [arr.length]; 

        for (int i = 0; i < extraArray.length; i++) {
            extraArray[i] = arr[arr.length  -i - 1];  //     When i is 0, arr.length - i - 1 gives 5 - 0 - 1 = 4, accessing the last element.
                                                        // When i is 1, arr.length - i - 1 gives 5 - 1 - 1 = 3, accessing the second-to-last element.
                                                        // And so on, until i is 4, which gives 5 - 4 - 1 = 0, accessing the first element.
        }
        for (int i : extraArray) {
            System.out.println(i + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 6 };
        // reverseArray(arr);
            reverseArrayWithExtraArray(arr);

    }
}
