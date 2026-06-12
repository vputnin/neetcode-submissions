class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int maxWindow = 1;
        int leftIdx = 0;
        int prevVal = 0;


        for(int i = 1; i < arr.length; i++) {
            int curVal = 0;

            if(arr[i-1] < arr[i]) {
                curVal = -1;
            } else if(arr[i-1] > arr[i]) {
                curVal = 1;
            }

            if (curVal == 0) {
                leftIdx = i;
            } else if(curVal == prevVal) {
                leftIdx = i-1;
            } 
            maxWindow = Math.max(maxWindow, i - leftIdx + 1);
            prevVal = curVal;
        }

        return maxWindow;

    }
}