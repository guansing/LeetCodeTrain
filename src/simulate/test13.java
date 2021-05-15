package simulate;

import java.util.HashMap;
import java.util.Map;

public class test13 {
    public int romanToInt(String s) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;

        for (int i = 0; i < n-1; i++) {
            int value = map.get(s.charAt(i));
            if (value < map.get(s.charAt(i+1))) {
                res = res - map.get(s.charAt(i));
            } else {
                res = res + map.get(s.charAt(i));
            }
        }

        res = res + map.get(s.charAt(n-1));

        return res;
    }
}
