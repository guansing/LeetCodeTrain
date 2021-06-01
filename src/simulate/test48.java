package simulate;

public class test48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        int[][] res = new int[n][n];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                // 找旋转后的规律
                res[j][n - i - 1] = matrix[i][j];
            }
        }
        // 将 res 数组中的数据重新赋值给原数组
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = res[i][j];
            }
        }
    }
}
