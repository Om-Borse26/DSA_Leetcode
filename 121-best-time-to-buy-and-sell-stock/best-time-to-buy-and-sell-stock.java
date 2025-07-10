class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int buy_price = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            int profit = 0;
            if(buy_price<prices[i]){
                profit = prices[i] - buy_price;
                max_profit = Math.max(profit, max_profit);
            }
            else{
                buy_price = prices[i];
            }
        }
        return max_profit;
    }
}