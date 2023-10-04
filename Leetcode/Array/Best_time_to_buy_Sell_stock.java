import java.util.*;
import java.lang.Math;
public class Best_time_to_buy_Sell_stock {

    public static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    


    public static void main(String[] args) {
        

        int prices[] ={7,6,4,3,1,8};

        int  maxProfit = 0;
        int minSOfar = prices[0];

        for (int i = 0; i < prices.length; i++) {
            minSOfar = Math.min(minSOfar,prices [i]);
            int profit = prices [i] - minSOfar;
            maxProfit = Math.max(maxProfit,profit);
        }

        System.out.println(" \n Our Profit Is : "+maxProfit+ "\n");

    }
}
