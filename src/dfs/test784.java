//package dfs;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class test784 {
//    public List<String> letterCasePermutation(String s) {
//        List<String> res = new ArrayList<>();
//        StringBuilder pre_str = new StringBuilder();
//
//        dfs(s, pre_str, res, 0, s.toCharArray());
//        return res;
//    }
//
//    // 这个题的特点是到 charAt(字母) 的时候才会进行 dfs 的递归(延展出左右两个分支)
//    private void dfs(String s, StringBuilder pre_str, List<String> res, int begin, char[] s_char) {
//        int str_length = pre_str.length();
//
//
//        if (str_length == s.length()) {
//            res.add(pre_str.toString());
//            return;
//        }
//
//        for (int i = begin; i < s.length(); i++) {
//
//            if (Character.isLetter(s.charAt(i))) {
//                s_char[i] ^= 1 << 5;
//                dfs(s, pre_str, res, i+1, s_char);
//                pre_str.deleteCharAt(s.length() - 1);
//            }
//        }
//    }
//}
