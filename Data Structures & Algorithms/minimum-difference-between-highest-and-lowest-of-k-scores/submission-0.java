class Solution {
    public int minimumDifference(int[] nums, int k) {
        //15 - 28 = 14
        //sort array 
        //define window 
        //int he window calc diff between left and right of the window 
        //math max difference 
        //move window with add to right and cut from left 

        if(k > nums.length) {
            return -1;
        }

        Arrays.sort(nums);

        int left = 0;
        int right = k - 1;

        int diff = nums[right] - nums[left];

        while(right < nums.length) {
            diff = Math.min(diff, nums[right] - nums[right - k + 1]);
            right+=1;
        }

        return diff;
    }
}