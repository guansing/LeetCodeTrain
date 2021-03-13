package heap;

import java.util.*;

public class test692 {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        List<String> res = new LinkedList<>();

        // 类型是否会自动转换
        // 注意这里必须要使用 int 的对象类型也就是 Integer 类型，因为对于 HashMap 而言，它的类型是 Integer，一定要匹配上
        for (String word : words) {
            Integer count = hashMap.get(word);
            hashMap.put(word, (count == null) ? 1 : count + 1);
        }

        PriorityQueue<String> pq = new PriorityQueue<>((o1, o2) -> {
            int v1 = hashMap.get(o1);
            int v2 = hashMap.get(o2);

            if (v1 != v2) {
                return v2 - v1;
            }
            return o1.compareTo(o2);
        });

        pq.addAll(hashMap.keySet());
        for (int i = 0; i < k; i++) {
            res.add(pq.poll());
        }
        return res;
    }
}



//    Map<String, Integer> map = new HashMap<>();
//        for (String str : words) {
//                map.put(str, map.getOrDefault(str, 0) + 1);
//                }
//
//                List<String> res = new ArrayList<>();
//        PriorityQueue<String> pq = new PriorityQueue<>((o1, o2) -> {
//        int v1 = map.get(o1);
//        int v2 = map.get(o2);
//        if (v1 != v2) return v2 - v1;
//        return o1.compareTo(o2);
//        });
//
//        pq.addAll(map.keySet());
//        for (int i = 0; i < k; i++) {
//        res.add(pq.poll());
//        }
//
//        return res;
