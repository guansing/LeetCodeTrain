package hash;

import com.sun.tools.javac.code.Attribute;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class test217 {
    public boolean containsDuplicate(int[] nums) {
        // 通过set的方式进行，好处是set存储的数都不重复，而且无顺序
//        Set<Integer> set = new HashSet<>();
//        for (int num: nums) {
//            set.add(num);
//        }
//        return set.size() == nums.length ? false : true;

        if (nums == null || nums.length == 0 || nums.length == 1) {
            return false;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int num : nums) {
            if (hashMap.containsKey(num)){
                hashMap.put(num, hashMap.get(num) + 1);
            } else {
                hashMap.put(num, 1);
            }
        }

        for (int k : hashMap.keySet()) {
            if (hashMap.get(k) > 1) {
                return true;
            }
        }
        return false;









        // 通过排序的方式进行
//        Arrays.sort(nums);
//        boolean isSame = false;
//
//        for (int i = 0;i < nums.length-1;i++) {
//            if (nums[i] == nums[i+1]) {
//                isSame = true;
//            }
//        }
//        return isSame;
    }
}
