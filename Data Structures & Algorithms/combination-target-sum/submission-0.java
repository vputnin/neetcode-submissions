class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, target, new ArrayList<>(), res);
        return res;
    }

    void backtrack(int[] nums, int start, int remaining, List<Integer> cur, List<List<Integer>> res) {
        if(remaining == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }

        if(remaining < 0) {
            return;
        }

        for(int i = start; i < nums.length; i++) {
            cur.add(nums[i]);
            backtrack(nums, i, remaining - nums[i], cur, res);
            cur.remove(cur.size() - 1);
        }
    }
}
