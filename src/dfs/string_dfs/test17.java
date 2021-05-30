package dfs.string_dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test17 {
    public List<String> letterCombinations(String digits) {
        List<String> path = new ArrayList<>();
        StringBuffer comb = new StringBuffer();

        if (digits.length() == 0) {
            return path;
        }

        Map<Character, String> phone_number = new HashMap<>();
        phone_number.put('2', "abc");
        phone_number.put('3', "def");
        phone_number.put('4', "ghi");
        phone_number.put('5', "jkl");
        phone_number.put('6', "mno");
        phone_number.put('7', "pqrs");
        phone_number.put('8', "tuv");
        phone_number.put('9', "wxyz");

        //dfs
        dfs(path, phone_number, digits, comb, 0);

        return path;
    }

    private void dfs(List<String> path, Map<Character, String> phone_number, String digits, StringBuffer comb, int depth) {
        if (depth == digits.length()) {
            path.add(comb.toString());
            return;
        }

        char digital = digits.charAt(depth);
        String letter = phone_number.get(digital);
        int len = letter.length();
        for (int i = 0; i < len; i++) {
            // dfs : 选择--递归--回溯
            comb.append(letter.charAt(i));
            dfs(path, phone_number, digits, comb, depth+1);
            comb.deleteCharAt(comb.length()-1);
        }
    }
}
