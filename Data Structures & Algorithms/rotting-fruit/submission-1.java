class Solution {
    int[][] directions = {{-1,0},{0,-1},{1,0},{0,1}};
    int unvisited = 0;

    public int orangesRotting(int[][] grid) {
        //find the source + 
        // start bfs from the source +
        // implement bfs with levels +
        // mark neighbor as visited +
        // count unvisited cells + 
        // decrement amount of univisited cells after visit + 
        // increment amount of minutes after each level +
        // if amount of unvisited cells is 0 return minutes else -1; + 
        // decrement last minute if there is a rotten fruit +

        int minutes = 0;
        
        Deque<int[]> deq = new ArrayDeque<>();

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    this.unvisited +=1;
                }
                if(grid[i][j] == 2) {
                    // unvisited -=1;
                    minutes = -1;
                    deq.addLast(new int[]{i,j});
                    
                }
            }
        }
        minutes = bfs(deq, grid, minutes);

        return unvisited > 0 ? -1 : minutes;
    }

    int bfs(Deque<int[]> deq, int[][] grid, int minutes) {
        while(!deq.isEmpty()) {

            int size = deq.size();

            while(size > 0) {
                int[] coordinate = deq.pollFirst();

                for(int[] direction : directions) {
                    int row = direction[0] + coordinate[0];
                    int column = direction[1] + coordinate[1];

                    if(row >= 0 && row < grid.length && column >= 0 && column < grid[0].length && 
                        grid[row][column] == 1) {
                            this.unvisited -=1;
                            grid[row][column] = 2;
                            deq.addLast(new int[]{row, column});
                    }
                }
                size-=1;
            }

            minutes+=1;
        }

        return minutes;
    }
}
