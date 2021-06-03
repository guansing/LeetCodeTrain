package dfs.floodfill_dfs;

public class test695 {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int ans = dfs(grid, i, j);
                    res = Math.max(res, ans);
                }
            }
        }
        return res;
    }


    private int dfs(int[][] grid, int x, int y) {
        int m = grid.length;
        int n = grid[0].length;

        if (x < 0 || x >= m || y < 0 || y >= n) {
            return 0;
        }

        if (grid[x][y] != 1) {
            return 0;
        }

        grid[x][y] = 2;
        return 1 + dfs(grid, x - 1, y) + dfs(grid, x + 1, y) + dfs(grid, x, y - 1) + dfs(grid, x, y + 1);
    }
}