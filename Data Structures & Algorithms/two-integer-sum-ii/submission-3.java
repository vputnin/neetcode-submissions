class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // 32
        //left right sum if bigger r- else l+

        int left = 0;
        int right = numbers.length - 1;

        while(left < right) {
            int sum = numbers[left] + numbers[right];

            if( sum == target) {
                return new int[]{left +1, right+1};
            } else if(sum > target ) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{0,0};






























        // int left = 0;
        // int right = numbers.length - 1;

        // while(left < right) {
        //     if(numbers[left] + numbers[right] == target) {
        //         return new int[]{left+1, right+1};
        //     } else if(numbers[left] + numbers[right] > target) {
        //         right--;
        //     } else {
        //         left++;
        //     }
        // }
        // return new int[0];
    }
}
