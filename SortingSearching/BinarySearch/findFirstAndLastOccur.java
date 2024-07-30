package SortingSearching.BinarySearch;

public class findFirstAndLastOccur {
    public static void main(String[] args) {

        int arr[] = {   21,33, 44, 65, 65, 87 ,99};

        int res[] = new int[2];
        int first = binarySearchFirstLast(arr, 65, true);
        int last = binarySearchFirstLast(arr, 65, false);

        res[0] = first;
        res[1] = last;

   

        for (int i = 0; i < res.length; i++) {
            System.out.println("Index = " + res[i]);
        }
     

    }

    public static int binarySearchFirstLast(int arr[], int target, boolean isFirst) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }

        }
        return ans;
    }

}