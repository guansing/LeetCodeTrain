package jianzhi2;

import java.util.HashMap;

public class test16 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashMap<Character, Integer> win_map = new HashMap<>();
        HashMap<Character, Integer> target_map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char cc = s.charAt(i);
            if(!target_map.containsKey(cc)) {
                target_map.put(cc, target_map.getOrDefault(cc, 0) + 1);
            }
        }
        int count = 0;
        int left = 0;
        int right = 0;
        while(right < s.length()) {
            char c = s.charAt(right);

            win_map.put(c, win_map.getOrDefault(c, 0) + 1);
            right++;
            if(win_map.get(c) == target_map.get(c)) {
                count++;
                max = Math.max(max, count);
            } else {
                right--;
                int cur_left = left;
                for(int i = cur_left; i < right; i++) {
                    char d = s.charAt(i);
                    if(win_map.get(d) > 1) {
                        left = i+1;
                        win_map.put(d, win_map.get(d)-1);
                        count--;
                        max = Math.max(max, count);
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        test16 t16 = new test16();
        int ss = t16.lengthOfLongestSubstring("abcadd");
        System.out.println(ss);
    }
}
