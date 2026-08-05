class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] sum = new int[nums.length];

        leftSum[0] = nums[0];
        rightSum[nums.length-1] = nums[nums.length-1];

        for(int i = 1; i < nums.length; i++) {
            leftSum[i] = nums[i] * leftSum[i-1];
        }

        for(int i = nums.length - 2; i >= 0; i--) {
            rightSum[i] = nums[i] * rightSum[i+1];
        }

        for(int i = 0; i < nums.length; i++) {
            if(i == 0) {
                sum[0] = rightSum[i+1];
            } else if(i == nums.length - 1) {
                sum[nums.length - 1] = leftSum[nums.length - 2];
            } else {
                sum[i] = leftSum[i - 1] * rightSum[i+1];
            }
        }
        return sum;
    }
}  
