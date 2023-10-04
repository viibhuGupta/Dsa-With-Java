import java.util.*;
import java.lang.Math;

public class Rain_Most_water_trapping_box {
    public static void main(String[] args) {
        
        int arr[] = {1,8,6,2,5,4,8,3,7};

        int l = 0 ; 
        int r = arr.length - 1; 
        int max = 0;

        while(l < r){
            int left = arr[l];
            int right = arr[r];

            int min_hight = Math.min (left, right);

            int length = r - l;

            int current_area = min_hight *  length;

            max = Math.max(max , current_area);

            if(left < right) l++;
            else r--;

        }

        System.out.println(max);
    }
}
