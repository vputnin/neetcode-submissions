class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        if(nums.length == 1) {
            return nums[0];
        }

// I solved it in 10 minutes, but honestly, I looked at the solution several times.
// Then I spent another 10–15 minutes rewriting it using a memoization array
// so I could understand it better and visualize how it works.
//
// Error 08: Failed test case.
//
// I realized that I had not read the requirements carefully and had misunderstood them.
// I thought the task required summation, but it actually required multiplication.
// I need to be more careful and precise when reading requirements.
//
// I felt emotionally overwhelmed because I had misread the requirements and needed time
// to adjust to the new task, especially compared with the previous sum-array problem.
// The next day, I started working through the solution with ChatGPT to understand what to do.
//
// Important reminder:
// Read the requirements carefully. If I realize that I misunderstood them, I should accept it
// and move on. It is simply a new task. I should not get stuck in negative emotions about myself,
// my attention, my life, or my future.
//
// Start again with a fresh attempt and keep moving forward. I am okay.
// Just read the requirements carefully.
// Solved it in 15 minutes.
// Initially, I didn't understand why `nums[i]` had to be included in:
// Math.max(nums[i], Math.max(memoMax[i - 1] * nums[i], memoMin[i - 1] * nums[i]));
//
// Spent another 15–20 minutes researching it after solution.
// I understand why it's needed for simple cases.

        int max = nums[0];
        int[] memoMax = new int[nums.length];
        int[] memoMin = new int[nums.length];
        memoMax[0] = nums[0];
        memoMin[0] = nums[0];

        for(int i = 1; i < nums.length; i++) {
            memoMax[i] = Math.max(nums[i], Math.max(memoMax[i-1] * nums[i], memoMin[i-1] * nums[i]));
            memoMin[i] = Math.min(nums[i], Math.min(memoMax[i-1] * nums[i], memoMin[i-1] * nums[i]));

            max = Math.max(max, memoMax[i]);
        }

        return max;
    }
}
