class Solution {
    public void sortColors(int[] nums) {

        int left = 0;
        int medium = 0;
        int right = nums.length - 1;

        while(medium <= right) {
            if(nums[medium] == 0) {
                swap(nums, left, medium);
                left++;
                medium++;
            } else if(nums[medium] == 2) {
                swap(nums, medium, right);
                right--;
            } else {
                medium++;
            }
        }
        
        


















        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // int left = 0;
        // int medium = 0;
        // int right = nums.length - 1;

        // while(medium <= right) {
        //     if(nums[medium] == 0) {
        //         swap(nums, left, medium);
        //         left++;
        //         medium++;
        //     } else if(nums[medium] == 1) {
        //         medium++;
        //     } else {
        //         swap(nums, right, medium);
        //         right--;
        //     }
        // }
    }

    public void swap(int[] nums, int left, int right) {
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }
}