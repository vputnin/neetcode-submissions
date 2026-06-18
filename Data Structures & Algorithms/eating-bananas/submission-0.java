class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int right = 0;
        int left = 1;
        int result = right;

        for(int i = 0; i < piles.length; i++) {
            right = Math.max(right, piles[i]);
        }
        result = right;

        int midSpeed = (right - left) / 2;
        while(left <= right) {

            int overalHours = 0;
            for(int i = 0; i < piles.length; i++) {
                int pile = piles[i];
                overalHours += (pile + midSpeed - 1) / midSpeed;
            } 

            if (overalHours > h) {
                left = midSpeed + 1;
            } else {
                result = Math.min(midSpeed, result);
                right = midSpeed - 1;
            }
            midSpeed = left + (right - left) / 2;
        }
        return result;
    }




}
