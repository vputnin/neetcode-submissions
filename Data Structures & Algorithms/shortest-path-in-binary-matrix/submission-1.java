class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        //17 started to read
        //35 stuck on how to move diagonally and how to remember the path
        //after some time, decided to update my way of defining the path with predefined directions because it is shorter.
        //Then switched to other tasks
        //07 decided to return to the task
        //25 minutes spent after the second attempt. Had bugs with the directions initialization.
        //Felt too relaxed and had syntax errors with adding and removing elements from the deque.

        if(grid[0][0] == 1 || grid[grid.length - 1][grid[0].length - 1] == 1) {
            return -1;
        }

        Deque<int[]> deq = new ArrayDeque<>();
        deq.addLast(new int[]{0,0,1});

        int[][] directions = {{-1,1},{1,1},{-1,0},{0,-1},{0,1},{1,0},{1,-1},{-1,-1}};
       
        while(!deq.isEmpty()) {
            int[] arr = deq.pollFirst();
            grid[arr[0]][arr[1]] = 1;

            if(arr[0] == grid.length - 1 && arr[1] == grid[0].length - 1) {
                return arr[2];
            }
            
            for(int[] dir : directions) {
                int x = arr[0] + dir[0];
                int y = arr[1] + dir[1];

                if(x >= 0 && x < grid.length && y >= 0 && y < grid[0].length 
                && grid[x][y] == 0) {
                    deq.addLast(new int[]{x,y, arr[2] + 1});
                }
            }
        }

        return -1;
    }
}