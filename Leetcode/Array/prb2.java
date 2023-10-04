import java.util.Arrays;

public class prb2 {

    public static int [] plusOne (int digit[]){
        int n = digit.length;

        for(int i = n-1 ; i >= 0;i++ ){
            if(digit[i] <= 9){
                digit[i]++;
                return digit;
            }
            digit [i ]=0;
        }
        int NumberArray[]= new int [n+1];
        return NumberArray;

    }
    public static void main(String[] args) {
        int nums []= {1,2,4,5,6,6};
        int [] result = plusOne(nums);
        System.out.println(Arrays.toString(result));
        
    }
    
}
