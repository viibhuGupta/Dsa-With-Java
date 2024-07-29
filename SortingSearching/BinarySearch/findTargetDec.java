package SortingSearching.BinarySearch;

public class findTargetDec {
    public static void main(String[] args) {
int arr[] = {99,87,65,44, 33,21};
findTargetDec(arr,21);
    }

    static void findTargetDec(int arr[], int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                break;
            } else if (arr[mid] > target) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        if (ans == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element at index : " + ans);
        }
    }
}
