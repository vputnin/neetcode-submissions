class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int curSum = 0;
        int digitsInWindow = 0;
        int minResult = Integer.MAX_VALUE;
        int leftBorder = 0;

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];

            curSum+=val;
            digitsInWindow +=1;

            // if(curSum >= target) {
            //     result = Math.min(digitsInWindow, minResult);
            // }

            while(curSum >= target) {
                minResult = Math.min(digitsInWindow, minResult);
                curSum-=nums[leftBorder];
                leftBorder+=1;
                
                digitsInWindow-=1;
            }
        }

        return minResult == Integer.MAX_VALUE ? 0 : minResult;
    }
}