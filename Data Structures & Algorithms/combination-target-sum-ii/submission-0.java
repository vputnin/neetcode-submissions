class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> state = new ArrayList<>();
        Arrays.sort(candidates);

        backtrack(candidates, target, res, state, 0, 0);
        return res;
    }

    void backtrack(int[] candidates, int target, List<List<Integer>> res, List<Integer> state, int tempSum, int startIndex) {
        if(tempSum == target) {
            res.add(new ArrayList<>(state));
            return;
        }

        if(tempSum > target) {
            return;
        }

        for(int i = startIndex; i < candidates.length; i++) {
            if(i > startIndex && candidates[i] == candidates[i - 1]) {
                continue;
            }
            state.add(candidates[i]);
            tempSum += candidates[i];
            backtrack(candidates, target, res, state, tempSum, i+1);
            tempSum -= candidates[i];
            state.remove(state.size() - 1);
        }
    }
}
