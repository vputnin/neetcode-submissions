class Solution {
    public int removeDuplicates(int[] nums) {
        // 38 54
        // if right == left move right else move left and right

        int left = 0;
        int right = 1;

        while(right < nums.length) {
            if(nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right];
                
            }
            right++;
        }
        return left + 1;





























        // int left = 0;
        // int right = 1;
        // if(nums.length < 2) {
        //     return nums.length;
        // }

        // // int res = 1;

        // while(right < nums.length) {
        //     if(nums[right] != nums[left]) {
        //         // res+=1;
        //         left+=1;
        //         nums[left] = nums[right];
        //     }
        //     right+=1;
            
        // }

        // return left + 1;
    }
}