class Solution {
    public int maxProfit(int[] prices) {
        //spent 20 minutes 
        int dpMin = prices[0];
        int res = 0;
        for(int i = 1; i < prices.length; i++) {
            dpMin = Math.min(prices[i], dpMin);
            int diff = prices[i] - dpMin;
            res = Math.max(res, diff);
        }
        return res;
    }
}
