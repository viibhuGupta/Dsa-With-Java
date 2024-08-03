package Array.problem;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class bestTimeToBuyStock {

    
    static int maxProfit(int prices[]) {

        int min = Integer.MAX_VALUE;
        int max = 0;
       

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= min) {
                min = prices[i];
            }

            else if (prices[i] - min > max) {
                max = prices[i] - min;
            }

        }

        return max;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 2, 4, 3, 2 };
        int ans = maxProfit(prices);
        System.out.println("ans " + ans);
    }

}
