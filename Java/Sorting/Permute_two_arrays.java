package Java.Sorting;

/* https://www.geeksforgeeks.org/permute-two-arrays-sum-every-pair-greater-equal-k/ 
 * 
 * 
 * Step 1: 1st sort the First Array in assending Order
 * Step 2: 2nd sort the Second Array in dessending Order
 * step 3: Start a loop i = o and i < n 
 * step 4: start if condition and check a[i] + b[i] < k return true othrt wise return false
*/



public class Permute_two_arrays {

    static int [] sortAssendingOrder(int nums[]){

    for(int i = 0; i < nums.length; i++){
        for(int j = i + 1 ; j < nums.length; j++){

            if (nums[j] < nums[i]) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                
            }
            

        }
    }

    return nums ;
}

    static int [] sortDecendingOrder(int nums[]){

        for(int i = 0; i < nums.length ; i++){

            for(int j = i + 1 ;j < nums.length ;j++ ){
                if () {
                    
                }
            }
        }
        return nums;
    }
    
}
