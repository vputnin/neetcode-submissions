class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftSums[] = new int[nums.length];
        int rightSums[] = new int[nums.length];
        int result[] = new int[nums.length];

        leftSums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            leftSums[i] = leftSums[i-1] * nums[i];
        } 

        rightSums[nums.length-1] = nums[nums.length-1];
        for(int i = nums.length - 2; i >= 0; i--) {
            rightSums[i] = rightSums[i+1] * nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[i] = rightSums[i + 1];
            } else if(i == nums.length-1) {
                result[i] = leftSums[i - 1];
            } else {
                result[i] = leftSums[i - 1] * rightSums[i + 1];
            }
        } 
        return result;
    }
}  
