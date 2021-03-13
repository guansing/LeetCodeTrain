package heap;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class test215 {
    public int findKthLargest(int[] nums, int k) {
        // 最大堆排序
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < nums.length; i++) {
            maxheap.add(nums[i]);
        }

        while (k > 1) {
            maxheap.poll();
            k--;
        }

        return maxheap.peek();


        // 暴力解法——————快排
//        List<Integer> list = new LinkedList<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            list.add(nums[i]);
//        }
//
//        Collections.sort(list);
//
//        for (int i = 0; i < list.size(); i++) {
//            nums[i] = list.get(i);
//        }
//
//        System.out.println(list);
//        System.out.println(Arrays.toString(nums));
//
//
//        return nums[nums.length-k];

    }
}
