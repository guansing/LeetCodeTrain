package dfs.floodfill_dfs;

public class test130 {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            // 竖方向 左边界
            dfs(board, i, 0);
            // 竖方向 右边界
            dfs(board, i, n-1);
        }

        for (int i = 0; i < n; i++) {
            // 横方向 左边界
            dfs(board, 0, i);
            // 横方向 右边界
            dfs(board, m-1, i);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 将所有的 O 即非边界相连的 O 转换为 X
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                // 将边界的 # 还原为 O
                if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void dfs(char[][] board, int i, int j) {
        int m = board.length;
        int n = board[0].length;
        // 判断如果是除了边缘之外的 O
        // 因为后面的四个dfs上下左右移动要确保是在整个区域范围内部移动的,所以i和j都不能越界
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return;
        }

        if (board[i][j] != 'O') {
            return;
        } else {
            board[i][j] = '#';

            dfs(board, i-1, j);
            dfs(board, i+1, j);
            dfs(board, i, j-1);
            dfs(board, i, j+1);
        }
    }
}
