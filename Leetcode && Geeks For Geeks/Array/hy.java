public class hy {

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 8, 32, 16, 60, 70, 89, 98, 45, 34, 23};
        int[] arr2 = {3, 7, 9, 30, 35, 24,67,45};

        int[] mergedArray = mergeInterleave(arr1, arr2);

        System.out.println("Merged and interleaved array: " + java.util.Arrays.toString(mergedArray));
    }


    private static int[] mergeInterleave(int[] arr1, int[] arr2) {
        int size1 = arr1.length;
        int size2 = arr2.length;
        int[] mergedArray = new int[size1 + size2];

        int i = 0, j = 0, k = 0;

        for (; i < size1 && j < size2; i++, j++) {
            mergedArray[k++] = arr1[i];
            mergedArray[k++] = arr2[j];
        }

        // If there are remaining elements in arr1, copy them
        for (; i < size1; i++) {
            mergedArray[k++] = arr1[i];
        }

        // If there are remaining elements in arr2, copy them
        for (; j < size2; j++) {
            mergedArray[k++] = arr2[j];
        }

        return mergedArray;
    }
}







