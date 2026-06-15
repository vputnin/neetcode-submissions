class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;

        for(int i = 0; i < nums.length; i++) {
            if(val != nums[i]) {
                nums[left] = nums[i];
                left++;
            }
        }

        return left;
    }
}