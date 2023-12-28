import java.util.Scanner;

public class find {

    static int linearSearch(int arr[], int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i; // element found
            }
        }
        return -1; // element not found
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,4,5,6,7};

        // System.out.println("Please Enter the Element");
        // int target = sc.nextInt();
        int target =35 ;

        int result = linearSearch(arr,target);

        System.out.println(result);
    }
}
