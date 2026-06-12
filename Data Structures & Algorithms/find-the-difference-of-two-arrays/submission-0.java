class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Map<Integer, Boolean> hmap1 = new HashMap<>();
        Map<Integer, Boolean> hmap2 = new HashMap<>();
        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++) {
            hmap1.put(nums1[i], true);
        }

        for(int i = 0; i < nums2.length; i++) {
            hmap2.put(nums2[i], true);
        }

        for (int i = 0; i < nums1.length; i++) {
            if (!hmap2.containsKey(nums1[i])) {
                res1.add(nums1[i]);
                hmap2.put(nums1[i], false);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (!hmap1.containsKey(nums2[i])) {
                res2.add(nums2[i]);
                hmap1.put(nums2[i], false);
            }
        }


        List<List<Integer>> res = new ArrayList<>();
        res.add(res1);
        res.add(res2);

        return res;

        
    }
}