package Array.problem;

public class maxMin {

    static void maxElement(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element is : "+max);
    }

    static void minElement(int arr[]){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum element is : "+min);
    }
    public static void main(String[] args) {
        int arr[] = {3, 5, 4, 1, 9};
        maxElement(arr);
        minElement(arr);
    }


}
