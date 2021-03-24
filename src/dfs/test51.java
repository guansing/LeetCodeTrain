package dfs;

import java.util.*;

public class test51 {

    List<List<String>> res = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        String[][] board = new String[n][n];
        for (String[] i : board) {
            Arrays.fill(i, ".");
        }

        dfs(board, 0);
        return res;
    }

    private void dfs(String[][] board, int row) {
        if (row == board.length) {
             res.add(array2List(board));
             return;
        }

        for (int i = 0; i < board.length; i++) {
            if (!isValid(board, row, i)) {
                continue;
            }
            board[row][i] = "Q";
            dfs(board, row + 1);
            board[row][i] = ".";
        }
    }

    // 用于读取字符流,用于拼接
    List<String> array2List(String[][] board){
        List<String> res = new LinkedList<>();
        for (String[] i : board){
            StringBuffer sb = new StringBuffer();
            for (String j : i){
                sb.append(j);
            }
            res.add(sb.toString());
        }
        return res;
    }

    private boolean isValid(String[][] board, int row, int col) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            if (board[i][col] == "Q") {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >=0 && j < n; i--, j++) {
            if (board[i][j] == "Q") {
                return false;
            }
        }

        for (int i = row - 1, j = col -1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == "Q") {
                return false;
            }
        }
        return true;
    }
}
