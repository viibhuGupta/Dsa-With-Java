import java.util.*;
import java.lang.Math;
public class Rain_Total_water_trapping {
    public static void main(String[] args) {
        
        int arr[] ={3,1,2,4,0,1,3,2};

        int n = arr.length;

        int left[] = new int [n];
        int right [] = new int [n];

        left[0] = arr[0];
        int i;
        
        for(i = 1 ; i < n; i++){
            left[i] = Math.max(left[i-1] , arr[i]) ;
        }

        right[n - 1] = arr[n -1 ] ;

        for(i = n - 2; i >= 0; i--){
            right[i] = Math.max(right[i + 1], arr[i]);
        }

        int ans = 0;

        for(i = 0 ; i < n; i++){
            ans += (Math.min (left[i] , right[i] ) - arr[i]);
        }

        System.out.println(ans);
    }
    
}
