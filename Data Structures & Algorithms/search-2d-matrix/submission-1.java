class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // 14

        int mediumCol = matrix.length / 2;
        int up = 0;
        int down = matrix.length - 1;
        int row = -1;

        while(up <= down) {
            int left = matrix[mediumCol][0];
            int right = matrix[mediumCol][matrix[mediumCol].length - 1];

            if(left <= target && target <= right) {
                row = mediumCol;
                break;
            } else if(left > target) {
                down = mediumCol - 1;
            } else {
                up = mediumCol + 1;
            }

            mediumCol = up + (down - up) / 2;
        }

        if(row == -1) {
            return false;
        }

        int[] arr = matrix[mediumCol];
        int left = 0;
        int right = arr.length - 1;
        mediumCol = arr.length / 2;
        
        while(left <= right) {
            if(arr[mediumCol] == target) {
                return true;
            } else if(arr[mediumCol] > target) {
                right = mediumCol - 1;
            } else {
                left = mediumCol + 1;
            }
            mediumCol = left + (right - left) / 2;
        }

        return false;
    }
}
