class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int leftIdx = 0;
        int rightIdx = 0;
        Map<Integer, Integer> hmap = new HashMap<>();
        
        if (nums.length <= 1 || k == 0) {
            return false;
        } 

        while(rightIdx < nums.length) {
            int digit = nums[rightIdx];
            if(hmap.containsKey(digit)) {
                if(rightIdx - leftIdx <= k) {
                    return true;
                }
            } else {
                hmap.put(nums[rightIdx], rightIdx);
                rightIdx+=1;
            }

            while(rightIdx - leftIdx > k) {
                hmap.remove(nums[leftIdx]);
                leftIdx++;
            } 
        }

        return false;

    }
}