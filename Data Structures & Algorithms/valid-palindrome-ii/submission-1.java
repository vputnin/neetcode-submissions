class Solution {
    public boolean validPalindrome(String s) {
        // 15 - 30 = 15. This solution was wrong. I implemented a greedy algorithm and missed an additional case.
        // It took 5 minutes to implement, but I found the solution with an LLM and implemented it after an hour.
        // I have to return to this task after some time.

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return isPalindrome(left + 1, right, s) || isPalindrome(left, right - 1, s);
            }
            left+=1;
            right-=1;
        }

        return true;
    }

    boolean isPalindrome(int left, int right, String s) {
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left+=1;
            right-=1;
        }

        return true;
    }
}