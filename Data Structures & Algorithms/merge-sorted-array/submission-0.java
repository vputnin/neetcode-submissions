class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int right1 = m - 1;
        int right2 = n - 1;
        int tailIdx = m + n - 1;

        while(right1 >= 0 && right2 >= 0) {
            if(nums1[right1] > nums2[right2]) {
                nums1[tailIdx] = nums1[right1];
                right1-= 1;
            } else {
                nums1[tailIdx] = nums2[right2];
                right2 -=1;
            }
            tailIdx -=1;
        }

        while (right2 >= 0) {
            nums1[tailIdx] = nums2[right2];
            right2-=1;
            tailIdx -=1;
        }
    }
}