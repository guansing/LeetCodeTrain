package offer;

public class offer04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int i = m-1;
        int j = 0;
        while (i >= 0 && j <= n-1) {
            if (matrix[i][j] > target) {
                System.out.println(i);
                System.out.println(j);
                i--;
            } else if (matrix[i][j] < target) {
                j++;
            } else if (matrix[i][j] == target) {
                return true;
            }
        }
        return false;
    }
}
