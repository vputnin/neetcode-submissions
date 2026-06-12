class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length <= 1) {
            return true;
        }

        int direction = 0;
        if(nums[1] >= nums[0]) {
            direction = 1;
        } else {
            direction = -1;
        }

        for (int i = 1; i < nums.length; i++) {
            if (direction > 0 && nums[i] < nums[i-1]) {
                return false;
            }

            if (direction < 0 && nums[i] > nums[i-1]) {
                return false;
            }
        }
        return true;
    }
}