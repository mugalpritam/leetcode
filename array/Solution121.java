package array;

//121. Best Time to Buy and Sell Stock

public class Solution121 {
    public int maxProfit(int[] prices) {
        int minSoFar = prices[0];
        int ans = 0;

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minSoFar;
            if (profit > ans) {
                ans = profit;
            }

            minSoFar = Math.min(prices[i], minSoFar);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution121 s = new Solution121();
        int[] prices = {7,1,5,3,6,4};
        int profit = s.maxProfit(prices);
        System.out.println(profit);

        int[]  prices1 = {7,6,4,3,1};
        int profit1 = s.maxProfit(prices1);
        System.out.println(profit1);
    }
}
