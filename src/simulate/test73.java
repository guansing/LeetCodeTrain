package simulate;

import java.util.Arrays;

public class test73 {
    public void setZeroes(int[][] matrix) {
        boolean r0 = false;
        boolean c0 = false;

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                r0 = true;
                break;
            }
        }

        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                c0 = true;
                break;
            }
        }


        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }

        for (int j = 1; j < n; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            if (matrix[i][0] == 0) {
                Arrays.fill(matrix[i], 0);
            }
        }

        if (r0) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }

        if (c0) {
            Arrays.fill(matrix[0], 0);
        }
    }
}
