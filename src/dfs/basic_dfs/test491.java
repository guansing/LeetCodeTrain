package dfs.basic_dfs;

import java.lang.reflect.Array;
import java.util.*;

public class test491 {
    HashSet<List<Integer>> set = new HashSet<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        Deque<Integer> path = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length+1];
        dfs(nums, 0, path, res, used);
        Iterator i = set.iterator();
        while (i.hasNext()){
//            System.out.println(i +" a");
            List<Integer> a = (List<Integer>) i.next();
            res.add(a);
//            for(int j = 0; j < a.size(); j++) {
//                System.out.print(a.get(j) + " ");
//
//            }
//            System.out.println();

        }
        return res;
    }

    private void dfs(int[] nums, int begin, Deque<Integer> path, List<List<Integer>> res, boolean[] used) {
        if (path.size() >= 2) {
            set.add(new ArrayList<>(path));
        }


        for (int i = begin; i < nums.length; i++) {

            if (!used[i]) {

//                if (path.contains(nums[i])) {
//                    continue;
//                }
                if (path.size() > 0 && nums[i] < path.getLast()) {
                    continue;
                }

                path.addLast(nums[i]);
                used[i] = true;
                dfs(nums, begin+1, path, res, used);
                used[i] = false;
                path.removeLast();
            }
        }
    }

//    public static void main(String[] args) {
//        test491 a = new test491();
//        int[] nums = new int[]{4,6,7,7};
//        System.out.println(a.findSubsequences(nums));
//    }
}
