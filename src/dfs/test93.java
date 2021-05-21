package dfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class test93 {
    public List<String> restoreIpAddresses(String s) {
        int len = s.length();
        List<String> res = new ArrayList<>();

        if (len > 12 || len < 4) {
            return res;
        }

        Deque<String> path = new ArrayDeque<>();
        int split = 0;
        dfs(s, len, split, 0, path, res);
        return res;
    }

    private int judge(String s, int left, int right) {
        int len = right - left + 1;

        if (len > 1 && s.charAt(left) == '0') {
            return -1;
        }
        // 字符串转换为数字,用于做比较和判断
        int res = 0;
        for (int i = left; i <= right; i++) {
            res = res * 10 + s.charAt(i)-'0';
        }

        // 对转换后的 res 数字进行范围的判断
        if (res > 255) {
            return -1;
        }
        return res;
    }

    private void dfs(String s, int len, int split, int begin, Deque<String> path, List<String> res) {

        if (begin == len) {
            // 如果是四个ip段的话,就可以用 string.join 的特性进行字符串与字符串之间用 . 分割的操作
            if (split == 4) {
                res.add(String.join(".", path));
            }
            return;
        }

        // 剩下的不到三个了就无需剪枝
        if (len - begin < (4 - split)) {
            return;
        }

        // 讨论取多了剩下的过少
        if (len - begin > 3 * (4-split)) {
            return;
        }

        for (int i = 0; i < 3; i++) {
            // 讨论没取够剩下的过多
            // 这里用 >= 是因为 i 最多能取值到 2,所以判断的时候可以取值到 len
            if (begin + i >= len) {
                break;
            }

            int ip_judge = judge(s, begin, begin+i);
            if (ip_judge != -1) {
                // 因为path是string类型的,所以刚刚用于判断的是int类型,要在添加到path的时候将其转换为string类型的
                path.addLast(ip_judge + "");
                dfs(s, len, split+1, begin+i+1, path, res);
                path.removeLast();
            }
        }
    }
}
