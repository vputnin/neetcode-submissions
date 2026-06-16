class Solution {
    public int climbStairs(int n) {
        if(n == 1) {
            return 1;
        }

        int stage1 = 1;
        int stage2 = 2;
        for(int i = 3; i <= n; i++) {
            int sum = stage2 + stage1;
            stage1 = stage2;
            stage2 = sum;
        }

        return stage2;
    }
}
