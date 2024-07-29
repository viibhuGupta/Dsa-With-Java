public class findMultiple {
    public static void main(String[] args) {
        int arr[] = { 1, 6, 1, 2, 1, 6 };

        linearSearchMultiple(arr, 60);
    }

    public static void linearSearchMultiple(int[] arr, int target) {
        int ans [] = new int[arr.length];
        int k = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans[k] = i;
                k++;
            }
        }
        if (k == 0) {
            System.out.println("Target in Not Present in Array");
        } else {
            for (int i = 0; i < k; i++) {
                System.out.println("Element Fount at pos : " + ans[i]);

            }
        }
    }
}
