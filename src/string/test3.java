package string;

import java.util.HashMap;

public class test3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        HashMap<Character, Integer> hashMap = new HashMap<>();

        int currentMax = 0;
        int left = 0;

        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                left = Math.max(left, hashMap.get(s.charAt(i)) + 1);
            }
            hashMap.put(s.charAt(i), i);
            currentMax = Math.max(currentMax, i -left+1);
        }
        return currentMax;
    }
}
