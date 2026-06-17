class Solution {
    public int search(int[] nums, int target) {
        int mediumIdx = nums.length / 2;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (target == nums[mediumIdx]) {
                return mediumIdx;
            } else

            if (target > nums[mediumIdx]) {
                left = mediumIdx + 1;

            } else if(target < nums[mediumIdx]) {
                right = mediumIdx - 1;
            }

            mediumIdx = left + (right - left + 1) / 2;
        }
        return -1;
    }
}
