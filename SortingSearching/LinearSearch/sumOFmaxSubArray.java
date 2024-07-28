public class sumOFmaxSubArray {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 3, 5, 8 },
                { 5, 7, 1, 0 },
                { 2, 1, 81, 7 },
                { 6, 4, 7, 100 }
        };
        sumOFmaxSubArray(arr);
    }

    public static void sumOFmaxSubArray(int arr[][]) {
        int max = Integer.MIN_VALUE;
        int resIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {

            sum = sum + arr[i][j];
           

        }
        if (sum > max) {
            max = sum;
            resIndex = i;
               }


        }

        System.out.println("Maximum sum of Subarrya is "+max+", for the index "+resIndex);

    }

}
