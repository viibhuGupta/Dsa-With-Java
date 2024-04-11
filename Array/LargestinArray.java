package Array;

public class LargestinArray {

    public static int[] getLargestElementIndex(int arr[]) {
        int largest = Integer.MIN_VALUE; // -Infinity
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
                index = i;

            }

        }

        return new int[] { largest, index };
    }

    public static int getLargestElement(int arr[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 8, 6, 1, 0 };
        int ans[] = getLargestElementIndex(arr);
        int largest = ans[0];
        int index = ans[1];
        System.out.println("Largest Element is ' " + largest + " ' at Index " + index);

        System.out.println("Larget Element : " + getLargestElement(arr));

    }
}
