public class findLast {
    public static void main(String[] args) {
        int arr[] = {1,6,1,2,1,6};
        
        linearSearchLast(arr,6 , true);
    }


    public static void linearSearchLast(int[] arr, int target , boolean findlast) {
        int ans = -1 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = i;
                if (findlast == false) {
                    break;
                }
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
