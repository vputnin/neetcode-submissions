class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1) {
                result = Math.max(result, i - left);
                left = i + 1;
            }
        }
        result = Math.max(result, nums.length - left);
        return result;
    }
}