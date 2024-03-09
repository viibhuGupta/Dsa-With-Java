package LinearSearch;

public class Searhch_element {

    public static void linearSearch(int arr[], int target) {
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = i;
                break;
            }
        }
        System.out.println("Found the " + target + " At index :" + ans);

    }

    // if element not present in the Array then Apply this 

    static void linearSearch2 (int arr[] , int target ){
        int ans = -1; // -1 when element is not present in the Array
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == target) {
                ans = i;
                break;
            }
        }
        if(ans == -1){
         System.out.println("Element is not Present in the Array");   
        }
        else{
            System.out.println(+target+" Found at Index : "+ans);

        }
        
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 9 };
        int target = 1;

        linearSearch2(arr, target);
    }

}
