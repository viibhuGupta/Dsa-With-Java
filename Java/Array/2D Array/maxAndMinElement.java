public class maxAndMinElement {
    
    /* https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/ */

    static void maxAndMinimumElement(int arr[] ){
        int max = arr[0] ;
        int min = arr[0] ; 
        
        for(int i = 0 ;  i < arr.length ; i++){
          if (max < arr[i]) {
                max = arr[i];
  
            }
            if ( min > arr[i] ){
                min = arr[i];
               
               
            }

            
        }

        System.out.println("Maximum : "+max);
        System.out.println("Minimam :" +min);
        
        
}


public static void main ( String arg[]){

    int nums [] = {3, 5, 4, 1, 9};

    maxAndMinimumElement(nums);
}
}