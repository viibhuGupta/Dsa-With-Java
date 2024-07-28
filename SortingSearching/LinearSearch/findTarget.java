public class findTarget {
    public static void main(String[] args) {
        int arr[] = {1,4,6,2,4,6};
        
        linearSearch(arr,6);
    }

    public static void linearSearch(int[] arr, int target) {
        int ans = -1 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = i;
                break;
            }
        }
        if (ans == -1) {
            System.out.println("Target in Not Present in Array");
        }
        else{
            System.out.println("Element Fount at pos : "+ans);
        }
    }




}
