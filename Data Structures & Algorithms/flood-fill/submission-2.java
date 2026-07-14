class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //20 reading requirements
        //25 start to code
        //will use BFS. 
        // 1 iterate from the starting point
        // apply BFS on the starting point on 2d array input
        // return 2d array input
        //40 started to debug, error searching
        //50 stopped to debug 
        //total - 30 minutes 


        

        Deque<int[]> deq = new ArrayDeque<>();

        int pixelColor = image[sr][sc];
        if(pixelColor == color) {
            return image;
        }
        deq.addLast(new int[]{sr,sc});

        bfs(image, pixelColor, color, deq);

        return image;

        

    }

    int[][] bfs(int[][] image, int pixelColor, int color, Deque<int[]> deq) {
        // System.out.println("pixeColor: " + pixelColor + " color: " + color + " deq0: " + deq.peekFirst()[0]);
        while(!deq.isEmpty()) {
            int[] pair = deq.pollFirst();

            if(image[pair[0]][pair[1]] == pixelColor) {
                
                image[pair[0]][pair[1]] = color;
                // System.out.println("color after: " + image[pair[0]][pair[1]]);
                if(pair[0] + 1 < image.length) {
                    deq.addLast(new int[]{pair[0] + 1, pair[1]});
                }
                if(pair[0] - 1 >= 0) {
                    deq.addLast(new int[]{pair[0] - 1, pair[1]});
                }
                if(pair[1] - 1 >= 0) {
                    deq.addLast(new int[]{pair[0], pair[1] - 1});
                }
                if(pair[1] + 1 < image[0].length) {
                    deq.addLast(new int[]{pair[0], pair[1] + 1});
                }
            } 
        }
        return image;
    }




}