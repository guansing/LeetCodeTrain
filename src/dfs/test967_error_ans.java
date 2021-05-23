package dfs;

import java.util.ArrayList;
import java.util.List;

public class test967_error_ans {
    public int[] numsSameConsecDiff(int n, int k) {

        StringBuffer digital = new StringBuffer();

        List<Integer> res = new ArrayList<>();
        dfs(n, k, digital, res);

        int[] nums = new int[res.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = res.get(i);
        }
        return nums;
    }

    // 关于用什么操作的问题
    // 如果只涉及纯数字的排列,没有组合,用Queue
    // 如果涉及到字符串类型的数字,果断用 StringBuffer 操作
    // 如果是涉及到纯数字的组合,可以用 StringBuffer,理由是对于一个大于一位的数字组合,可以很方便地去查找位数,之后只需要转换回数字就行
    private void dfs(int n, int k, StringBuffer digital, List<Integer> res) {
        if (digital.length() == n) {
            res.add(Integer.parseInt(digital.toString()));
            return;
        }

        for (int i = 0; i < 10; i++) {
            int pre_digital = 0;
            // 别忘记digital的每一位目前都是字符 char 类型的,所以最后要减去 '0',digital.length()-1 本身是数字
            if (digital.length() != 0) {
                pre_digital = digital.charAt(digital.length()-1)-'0';
            }
            if (pre_digital + k < 10) {
                digital.append(pre_digital + i + "");
                dfs(n, k, digital, res);
                digital.deleteCharAt(digital.length()-1);
            }

            if (pre_digital - k >= 0) {
                digital.append(pre_digital + i + "");
                dfs(n, k, digital, res);
                digital.deleteCharAt(digital.length()-1);
            }
        }
    }
}
