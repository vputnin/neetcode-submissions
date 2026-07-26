class Solution {
    public int shipWithinDays(int[] weights, int days) {
        // 43 
        //binary search 
        //left = minWeight 
        //right = maxWeight
        //minWeight = Max(weights)
        //maxWeight = Sum(weights);
        //

        int left = 0;
        int right = 0;

        for(int i = 0; i < weights.length; i++) {
            left = Math.max(weights[i], left);
            right += weights[i];
        }

        while(left < right) {
            int mid = left + (right - left) / 2;

            if(canDo(weights, days, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public boolean canDo(int[] weights, int days, int mid) {
        int day = 1;
        int tmp = 0;

        for(int i = 0; i < weights.length; i++) {
            tmp += weights[i];

            if(tmp > mid) {
                day += 1;
                tmp = weights[i];
            }

            if(day > days) {
                return false;
            }
        }

        return true;
    }
}