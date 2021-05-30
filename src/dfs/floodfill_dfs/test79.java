package dfs.floodfill_dfs;

public class test79 {
    boolean result = false;
    int m;
    int n;
    public boolean exist(char[][] board, String word) {
        n = board.length;
        m = board[0].length;
        int length = word.length();
        boolean[][] used = new boolean[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == word.charAt(0)) {
                    dfs(board, word, used, i, j, 0, length);
                }

                else {
                    continue;
                }
            }
        }
        return result;
    }

    private void dfs(char[][] board, String word, boolean[][] used, int x, int y, int index, int length) {
        if (index == length) {
            result = true;
            return;
        }

        else if (result) {
            return;
        }

        else if(x > -1 && x < m && y > -1 && y < n){
            if(!used[x][y] && board[x][y] == word.charAt(index)){
                used[x][y] = true;

                dfs(board, word, used, x+1, y, index+1, length);
                dfs(board, word, used, x-1, y, index+1, length);
                dfs(board, word, used, x, y+1, index+1, length);
                dfs(board, word, used, x, y-1, index+1, length);

                used[x][y] = false;
            }
        }
    }
}
