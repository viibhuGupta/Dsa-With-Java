package LinearSearch;

public class Searhch_element {

    public static void main(String[] args) {
        int arr[] = { 6, 2, 3, 4, 5, 6, 7, 9 };
        int target = 6;

        // linearSearch(arr, target,false);
        // linearSearch(arr, target,true);

        LinearSearchMultiple(arr, target);
    }

    static void linearSearch (int arr[] , int target , boolean findLast){
        int ans = -1; // -1 when element is not present in the Array
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == target) {
                ans = i;
                
                if (findLast == false) { // when we need to find last index
                    break;
                }
            }
        }
        if(ans == -1){
         System.out.println("Element is not Present in the Array");   
        }
        else{
            System.out.println(+target+" Found at Index : "+ans);

        }
        
    }

    public static void LinearSearchMultiple (int []arr , int target ){
        int ans[] = new int[arr.length];
        int k = 0; // to target the ans array index
        for(int i = 0 ; i < arr.length ; i++){
            if (arr[i] == target) {
                ans[k] =i;
                k++; 
            }
        }

        if (k == 0) {
            System.out.println("Element not present in Array"); 
        }
        else{
            for(int j =0; j< k; j++){
                System.out.println("Element found at index :" + ans[j]);
            }
        }
    }


}
