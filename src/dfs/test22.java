package dfs;

import java.util.ArrayList;
import java.util.List;

public class test22 {
    public List<String> generateParenthesis(int n) {
        StringBuilder cur_str = new StringBuilder();
        List<String> res = new ArrayList<>();

        dfs(cur_str, n, n, res);
        return res;
    }

    // 因为 n 表示括号的对数,所以用 left 和 right 分别表示左右括号的数量
    // 终止条件就是左右括号都用完的时候
    private void dfs(StringBuilder cur_str, int left_parenthesis, int right_parenthesis, List<String> res) {
        if (left_parenthesis == 0 && right_parenthesis == 0) {
            res.add(cur_str.toString());
            return;
        }

        // 这里是如果剩下的左括号数量大于剩余的有括号数量,也就是说当前使用的有括号数量如果比左括号多,那么不成立,剪枝
        if (left_parenthesis > right_parenthesis) {
            return;
        }

        if (left_parenthesis > 0) {
            cur_str.append("(");
            dfs(cur_str, left_parenthesis - 1, right_parenthesis, res);
            cur_str.deleteCharAt(cur_str.length()-1);
        }

        if (right_parenthesis > 0) {
            cur_str.append(")");
            dfs(cur_str, left_parenthesis, right_parenthesis - 1, res);
            cur_str.deleteCharAt(cur_str.length()-1);
        }
    }
}
