class Solution {
    public int climbStairs(int n) {
        //spent about 5 minutes, but I rewrote solution with memo bottom up
        if(n == 1) {
            return 1;
        }
        int[] memo = new int[n + 1];

        int stage1 = 1;
        int stage2 = 2;
        memo[1] = 1;
        memo[2] = 2;

        for(int i = 3; i <= n; i++) {
            memo[i] = memo[i-1] + memo[i - 2];
        }

        return memo[n];
    }

    // public int climbStairs(int n) {
    //     //spent about 5 minutes, but I rewrote solution with up to buttom, exceeded time limit. The goal was to remember top to buttom.
    //     if(n == 1) {
    //         return 1;
    //     }

    //     return dp(n);
    // }

    // int dp(int n) {
    //     if(n <= 1) {
    //         return 1;
    //     }

    //     return dp(n - 1) + dp(n - 2);
    // }
}
