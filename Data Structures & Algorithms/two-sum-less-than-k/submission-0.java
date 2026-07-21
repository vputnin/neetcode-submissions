class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int result = -1;

        while(left < right) {

            if(nums[left] + nums[right] < k) {
                result = Math.max(result, nums[left] + nums[right]);
                left+=1;
            } else {
                right-=1;
            }
        }

        return result;
    }
}
