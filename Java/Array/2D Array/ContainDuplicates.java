public class ContainDuplicates {

    static boolean isContainDuplicates (int arr[]){

        //  the time Compelicty of this code is O(n^2) time 

        for( int i =0 ;  i< arr.length ; i++ ){
            for( int j = i+ 1 ; j< arr.length ; j++){
               if (arr[i] == arr[j]) {
                return true;
                
               }
            }

        } return false;
    }



    
    public static void main(String[] args) {

            int num [] = {1,2,3,1};
            
            System.out.println(isContainDuplicates(num));
    }
    
}
