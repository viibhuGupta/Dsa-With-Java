public class findMultipleIn2D {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 3, 5, 8 },
                { 5, 7, 1, 0 },
                { 2, 1, 8, 7 },
                { 6, 4, 7, 0 }
        };
        findTragetIn2DMultiple(arr, 1);

    }

    public static void findTragetIn2DMultiple(int arr[][], int target) {
        // find size if the array is jagged
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            size = size + arr[i].length;
        }

        int ans[][] = new int[size][2];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr[i].length; j++) {

                if (target == arr[i][j]) {
                    ans[k][0] = i;
                    ans[k][1] = j;
                    k++;
                }
            }
            if (found == true) {
                break;
            }

        }

        if (k == 0) {
            System.out.println("Target in Not Present in Array");
        } else {
            for (int i = 0; i < k; i++) {
                System.out.println("At Col " + ans[i][0] + " and At Row " + ans[i][1]);

            }

        }
    }

}
