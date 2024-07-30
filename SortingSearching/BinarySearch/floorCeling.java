package SortingSearching.BinarySearch;

public class floorCeling {
    public static void main(String[] args) {
        int arr[] = { 4, 4, 8, 8, 8, 15, 16, 23, 23, 42 };
        int ans = bsOfFloor(arr, 6);
        System.out.println("Floor is : " + ans);
        int ans1 = bsOfCeil(arr, 12);
        System.out.println("Ceil is : " + ans1);

    }

    static int bsOfFloor(int arr[], int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = arr[mid];
                break;
            }

            else if (arr[mid] < target) {
                start = mid + 1;
                ans = arr[mid];
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

    static int bsOfCeil(int arr[], int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = arr[mid];
                break;
            }

            else if (arr[mid] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;
                ans = arr[mid];
            }
        }

        return ans;
    }
}
