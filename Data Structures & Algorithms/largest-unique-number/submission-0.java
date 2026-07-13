class Solution {
    public int largestUniqueNumber(int[] nums) {
        // 03 30 
        Map<Integer, Integer> map = new HashMap<>();
        int max = -1;

        for(int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], 2);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                max = Math.max(max, entry.getKey());
            }
        }

        return max;

    }
}
