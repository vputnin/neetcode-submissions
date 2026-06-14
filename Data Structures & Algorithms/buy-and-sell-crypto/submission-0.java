class Solution {
    public int maxProfit(int[] prices) {
        int small = prices[0];
        int res = 0;

        for(int i=1; i < prices.length;i++) {
            int diff = prices[i] - small;

            res = Math.max(res, diff);
            small = Math.min(small, prices[i]);
        }
        return res;
    }
}
