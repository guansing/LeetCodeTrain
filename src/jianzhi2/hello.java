package jianzhi2;

import java.util.HashMap;

public class hello {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(3);
        map.put("AA", 1);
        map.put("AA", 2);
        map.put("AA", 1);
        System.out.println(map.size());
    }
}
