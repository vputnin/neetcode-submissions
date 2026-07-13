class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        //45 47 58 
        // 13 minutes on solution with queue and 4 minutes for removing queue
        // Map<Integer, Deque<Integer>> map = new HashMap<>();

        // for(int i = 0; i < nums2.length; i++) {
        //     if(map.get(nums2[i]) == null) {
        //         Deque<Integer> deq = new ArrayDeque<>();
        //         deq.addLast(i);
        //         map.put(nums2[i], deq);
        //     } else {
        //         map.get(nums2[i]).addLast(i);
        //     }
        // }

        // for(int i = 0; i < nums1.length; i++) {
        //     int val = nums1[i];
        //     nums1[i] = map.get(nums1[i]).pollFirst();
        // }

        // return nums1;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }

        for(int i = 0; i < nums1.length; i++) {
            nums1[i] = map.get(nums1[i]);
        }

        return nums1;
        



    }
}
