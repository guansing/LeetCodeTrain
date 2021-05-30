package dfs.string_dfs.test967;

import java.util.ArrayList;
import java.util.List;

public class test967_optimize_ans {
    List<Integer> res = new ArrayList<>();
    public int[] numsSameConsecDiff(int n, int k) {
        StringBuilder digital = new StringBuilder();
        dfs(n, k, digital);
        int[] nums = new int[res.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = res.get(i);
        }
        return nums;

    }

    private void dfs(int n, int k, StringBuilder digital) {
        if (digital.length() == 0) {
            for (int i = 1; i <= 9; i++) {
                //如果i+k或者i-k都不是有效的字符，说明当前i不能作为数字的开头
                if (i + k > 9 && i - k < 0)
                    continue;
                //进入递归
                dfs(n, k, new StringBuilder(String.valueOf(i)));
            }
        } else {
            if (digital.length() == n) {
                res.add(Integer.parseInt(digital.toString()));
                return;
            }

            int pre_digital = 0;
            if (digital.length() != 0) {
                pre_digital = digital.charAt(digital.length() - 1) - '0';
            }

            int up = pre_digital + k;
            int down = pre_digital - k;
            if (up < 10) {
                digital.append(up + "");
                dfs(n, k, digital);
                digital.deleteCharAt(digital.length() - 1);

            }
            if (down >= 0 && up != down) {
                digital.append(down + "");
                dfs(n, k, digital);
                digital.deleteCharAt(digital.length() - 1);
            }
        }
    }
}
