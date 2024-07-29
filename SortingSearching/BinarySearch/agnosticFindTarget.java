package SortingSearching.BinarySearch;

public class agnosticFindTarget {
    public static void main(String[] args) {
        int arr[] = {12,16,80,89,91,99};
        int arr2[] = {99,65,55,44,33,21,11};
        agnosticFindTarget(arr,80);
        agnosticFindTarget(arr2,90);

    }

    static void agnosticFindTarget(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] < arr[end]) {
            binarySearch(arr, target);
        } else {

            findTargetDec(arr, target);
        }
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
                end = mid - 1;
            }
        }
        if (ans == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element at index : " + ans);
        }
    }

    public static void binarySearch(int arr[], int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        if (ans == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element at index : " + ans);
        }
    }
}
