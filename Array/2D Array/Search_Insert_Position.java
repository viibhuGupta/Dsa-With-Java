
public class Search_Insert_Position{


    public static int searchArray (int arr [],int target){
      int start = 0;
      int end =arr.length-1;
     

      while(start <= end){

        int mid = (start +end )/2;

        if(arr[mid] == target){
              return mid;
        }
        else if(arr[mid] > target){
            end = mid -1;
        }

        else{
            start = mid + 1;
        }
      }
      return start;
}



    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        int target = 2;

        // int ans = search(arr, target);
        // System.out.println(ans);
        System.out.println(searchArray(arr, target));


}


}