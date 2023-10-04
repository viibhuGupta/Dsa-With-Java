import java.util.Arrays;
public class plusOneWithout_using_fn {
    
    public static void main(String[] args) {

        // creating a array 
        int nums[] = {9,9,8};
        // taking the total Size of Array
        int n = nums.length;

        // Accessing the last element of the array by loop
        for (int i = n - 1; i >= 0; i--) {

            // now comparing the last element of the Array is less or equal to 9 if yes then the last element of the Array + 1;

            if (nums[i] < 9) {
                nums[i]++;

                // after that  print the array not the index of Array after print just return ;
                System.out.println(Arrays.toString(nums)); 
                return;
            }

            // after the if loop exist if the last elemet is greater than 9 then nums[last index] = 0; to set the last elemet 0 ;  
            nums[i] = 0;
        }


        // if the condition is not true then create a new array with the length of n + 1 to accomondate carry digits  



        int[] NumberArray = new int[n + 1];

        // then set the create array of 0 index to 1 for Ex : 9999 so it do 1 0 0 0 0
        NumberArray[0] = 1;
        // this loop is for print the new Array
        System.out.println(Arrays.toString(NumberArray));
    }
}


