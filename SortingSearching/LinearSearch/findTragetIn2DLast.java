public class findTragetIn2DLast {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 3, 5, 8 },
                { 5, 7, 1, 0 },
                { 2, 1, 8, 7 },
                { 6, 4, 7, 0 }
        };

        findTragetIn2DLast(arr, 7);
    }

    public static void findTragetIn2DLast(int arr[][], int target) {
        int outerIndex = -1;
        int innerIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (target == arr[i][j]) {
                    outerIndex = i;
                    innerIndex = j;

                }
            }

        }

        if (outerIndex == -1) {
            System.out.println("Target in Not Present in Array");
        } else {
            System.out.println("At Col " + outerIndex + " and At Row " + innerIndex);
        }
    }
}
