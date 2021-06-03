package dfs.floodfill_dfs;

public class test200 {
    public int numIslands(char[][] grid) {
        int res = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    // 相当于执行完一次完整的dfs之后就会去加一
                    res = res + 1;
                }
            }
        }
        return res;
    }

    private void dfs(char[][] grid, int x, int y) {
        int m = grid.length;
        int n = grid[0].length;

        if (x < 0 || x >= m || y < 0 || y >= n) {
            return;
        }

        if (grid[x][y] != '1') {
            return;
        }

        grid[x][y] = '2';
        // 上
        dfs(grid, x, y-1);
        // 下
        dfs(grid, x, y+1);
        // 左
        dfs(grid, x-1, y);
        // 右
        dfs(grid, x+1, y);
    }
}
