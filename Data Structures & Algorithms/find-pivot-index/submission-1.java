class Solution {
    public int pivotIndex(int[] nums) {
        //sum everything 
        //sum lefts and reduce from sum
        //compare rest with cur sum

        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum+= nums[i];
        }

        int leftSum = 0;
        for(int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            // System.out.println("leftSum: " + leftSum);
            // System.out.println("sum: " + sum);
            // System.out.println("res: " + (sum - leftSum) + "-");
            // System.out.println("===== ");
            if(sum - leftSum + nums[i] == leftSum) {
                return i;
            }
        }

        return -1;































        // int leftSum = 0;
        // int rightSum = 0;

        // for(int i = 0; i < nums.length; i++) {
        //     rightSum += nums[i];
        // }

        // for(int i = 0; i < nums.length; i++) {
        //     rightSum -= nums[i];
        //     if(leftSum == rightSum) {
        //         return i;
        //     }

        //     leftSum += nums[i];
            
        // }
        // return -1;
    }
}