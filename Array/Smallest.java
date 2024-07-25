package Array;

public class Smallest {

    public static int [] getSmallestElementORIndex (int arr[]){
        int smallest = Integer.MAX_VALUE; // + infinity
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if ( smallest > arr[i]) {
                smallest = arr[i];
                index = i;
            }
        }
        return new int []{smallest,index};
    }


    public static int getSmallestElement (int arr[]){
        int smallest = Integer.MAX_VALUE; // + infinity
       
        for (int i = 0; i < arr.length; i++) {
            if ( smallest > arr[i]) {
                smallest = arr[i];
                
            }
        }
        return smallest;
    }
    
    public static void main(String[] args) {
        int arr[] = { 12, 8, 6, 1, 0 };
        int ans []= getSmallestElementORIndex(arr);
        int  smallest = ans[0];
        int index = ans[1];

        System.out.println("Smallest Element is ' " + smallest + " ' at Index " + index);


    // int ans = getSmallestElement(arr);
    // System.out.println(ans);

    }
}
