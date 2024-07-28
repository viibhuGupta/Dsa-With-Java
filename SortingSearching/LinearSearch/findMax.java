public class findMax {
    public static void main(String[] args) {

        int arr[] = { 9, 6, 4, 2, 11, 6 };
        // findMax(arr);
        findMax2(arr);

    }

    public static void findMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max Value is : " + max);
    }

    public static void findMax2(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max Value is : " + max);
    }
}
