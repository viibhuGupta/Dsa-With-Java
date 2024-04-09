package Array;
public class findKey {

    public static int getTarget (int arr[] , int target){
       

        for(int i = 0 ; i < arr.length ; i++){
            if (arr[i] == target) {
                return i;
               
            }
        }
        return -1; 
    }

    
    public static void main ( String arg[]){
        int arr[] = { 1, 13, 6,5, 12};
        int target = 6;
       
       int index = getTarget(arr, target);
       if (index == -1) {
        System.out.println("Element not exists in Array");
       }
       else{
        System.out.println("Index : "+index);
       }
    }
}
