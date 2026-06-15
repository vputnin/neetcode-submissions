class Solution {
    public int[] replaceElements(int[] arr) {
        int curMax = arr[arr.length-1];
        arr[arr.length-1] = -1;
        for(int i = arr.length - 2; i >= 0; i--) {
            if(arr[i] <= curMax) {
                arr[i] = curMax;
            } else {
                int tmp = arr[i];
                arr[i] = curMax;
                curMax = tmp;
            }
        }
        return arr;
    }
}