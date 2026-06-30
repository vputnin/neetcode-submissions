class Solution {
     Map<Character, String> map = Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz"
        );

    public List<String> letterCombinations(String digits) {
        

        List<String> res = new ArrayList<>();
        if (digits.length() == 0) {
            return res;
        }

        backtrack(digits, res, new StringBuilder(), 0);
        return res;
    }

    void backtrack(String digits, List<String> res, StringBuilder state, int digitIndex) {
        if(state.length() == digits.length()) {
            res.add(state.toString());
            return;
        }

        String letters = map.get(digits.charAt(digitIndex));
        for(Character c : letters.toCharArray()) {
            state.append(c);
            backtrack(digits, res, state, digitIndex + 1);
            state.deleteCharAt(state.length() - 1);
        }
    }
}
