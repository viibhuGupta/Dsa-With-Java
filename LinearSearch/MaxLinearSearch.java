package LinearSearch;

public class MaxLinearSearch {
  public static void main(String[] args) {

    int arr[] = { 6, 2, 3, 4, 5, 6, 7, -9 };
   
    maxSearch(arr);
  }

  public static void maxSearch (int arr[]){
    // int max = arr[0]; // 0 because the intial value of max is arr[o]
    int max = Integer.MIN_VALUE;

    for(int i = 0 ; i < arr.length ; i++){
        if (max < arr[i]) {
            max = arr[i];
        }
    }
    System.out.println("Maximum value is :" +max);
  }


}
