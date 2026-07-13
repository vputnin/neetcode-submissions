class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Boolean> map = new HashMap<>();

        for(int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], true);
        }

        Map<Integer, Integer> map2 = new HashMap<>();

        for(int i = 0; i < nums2.length; i++) {
            if(map.get(nums2[i]) != null && map2.get(nums2[i]) == null) {
                map2.put(nums2[i], nums2[i]);
            } 
        }

        
        int[] result = new int[map2.size()];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            result[i] = entry.getKey();
            i++;
        }

        return result;
    }
}