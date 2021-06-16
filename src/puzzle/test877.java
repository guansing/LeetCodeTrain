package puzzle;

public class test877 {
    // 脑筋急转弯,博弈问题
//    public boolean stoneGame(int[] piles) {
//        return true;
//    }

    class Pair {
        int fir, sec;
        Pair(int fir, int sec) {
            this.fir = fir;
            this.sec = sec;
        }
    }


        /* 返回游戏最后先手和后手的得分之差 */
        int stoneGame(int[] piles) {
            int n = piles.length;
            // 初始化 dp 数组
            Pair[][] dp = new Pair[n][n];
            for (int i = 0; i < n; i++){
                for (int j = i; j < n; j++) {
                    dp[i][j] = new Pair(0, 0);
                }
            }

            // 填入 base case
            for (int i = 0; i < n; i++) {
                dp[i][i].fir = piles[i];
                dp[i][i].sec = 0;
            }


            // 斜着遍历数组
            for (int l = 2; l <= n; l++) {
                for (int i = 0; i <= n - l; i++) {
                    int j = l + i - 1;
                    // 先手选择最左边或最右边的分数
                    int left = piles[i] + dp[i+1][j].sec;
                    int right = piles[j] + dp[i][j-1].sec;
                    // 套用状态转移方程
                    if (left > right) {
                        dp[i][j].fir = left;
                        dp[i][j].sec = dp[i+1][j].fir;
                    }
                    else {
                        dp[i][j].fir = right;
                        dp[i][j].sec = dp[i][j-1].fir;
                    }
                }
            }
            Pair res = dp[0][n-1];
            return res.fir - res.sec;
        }



    public static void main(String[] args) {
        test877 a = new test877();
        int[] nums = {3,9,1,2};
        int res = a.stoneGame(nums);
        System.out.println(res);

    }
}