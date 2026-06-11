class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int leftSum = 0;

        for(int right = 0; right < nums.length; right++) {
            int rightVal = nums[right];

            if (rightVal >= leftSum + rightVal) {
                leftSum = rightVal;
            } else {
                leftSum += rightVal;
            }

            max = Math.max(max, leftSum);
        }

        return max;
    }
}
