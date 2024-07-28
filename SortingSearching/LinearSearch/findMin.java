public class findMin {
    public static void main(String[] args) {
        int arr[] = { 9, 6, 4, 2, 11, 6 };
        findMin(arr);
    }

    public static void findMin(int arr[]){
        int min = arr[0]; // smallet value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min Value is : " +min );
    }

    public static void findMin2(int arr[]){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min Value is : " +min );
    }
}
