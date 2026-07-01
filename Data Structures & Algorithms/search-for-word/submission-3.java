class Solution {
    public boolean exist(char[][] board, String word) {
        //21.50 
        //21.55 had ADHD, then started to implement
        //22.27 felt arrogant on this task because I knew how to solve it. Lost time on small details in dfs
        //with return logic, forgot to mark visited cells as visited, used unnecessary StringBuilder and spent time on removing it


        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                 if( dfs(i, j, board, new StringBuilder(), word, 0)) {
                    return true;
                 }
            }
        }
        return false;
    }

    boolean dfs(int i, int j, char[][] board, StringBuilder builder, String word, int index) {
        if(index >= word.length()) {
            return true;
        }

        if(i < 0 || i >= board.length || j < 0 || j >= board[i].length) {
            return false;
        }

        if(board[i][j] != word.charAt(index)) {
            return false;
        }

        // builder.append(board[i][j]); 
        char original = board[i][j];
        board[i][j] = '#';
        index++;
        

        boolean res = dfs(i+ 1, j, board, builder, word, index) || 
        dfs(i- 1, j, board, builder, word, index) || 
        dfs(i, j + 1, board, builder, word, index) ||
        dfs(i, j - 1, board, builder, word, index);

        board[i][j] = original;
        return res;
    }
}
