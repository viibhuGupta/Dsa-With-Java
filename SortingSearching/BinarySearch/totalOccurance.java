package SortingSearching.BinarySearch;

public class totalOccurance {
    public static void main(String[] args) {
        int arr[] = { 4, 4, 8, 8, 8, 15, 16, 23, 23, 42 };
        int first = totalOccurance(arr, 8, false);
        int last = totalOccurance(arr, 8, true);

        int totalOccourance = (last - first + 1);

        if (first == -1) {
            System.out.println("Occourance of Target is : " + 0);
        } else {
            System.out.println("No of Occourance of target  is : " +totalOccourance);
        }

    }

    static int totalOccurance(int arr[], int target, boolean isLast) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;

                if (isLast) {
                    start = mid + 1;

                } else {
                    end = mid - 1;
                }
            }

            else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
}
