class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        Map<Integer, Integer> prevSums = new HashMap<>();
        prevSums.put(0, 1);

        int curSum = 0;

        for(int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            int diff = curSum - k;

            res += prevSums.getOrDefault(diff,0);

            prevSums.put(curSum, prevSums.getOrDefault(curSum, 0) + 1);
        }

        return res;
    }
}