package dfs.string_dfs.test967;

import java.util.ArrayList;
import java.util.List;

public class test967 {
    int count = 0;
    public int[] numsSameConsecDiff(int n, int k) {
        StringBuffer digital = new StringBuffer();
        List<Integer> res = new ArrayList<>();
        dfs(n, k, digital, res);
        int[] nums = new int[res.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = res.get(i);
        }
        return nums;

    }

    private void dfs(int n, int k, StringBuffer digital, List<Integer> res) {
        if (digital.length() ==0){
            for(int i =1; i < 10; i++) {
                StringBuffer s = new StringBuffer(String.valueOf(i));
                dfs(n, k, s, res);
            }
            return;
        }

        if (digital.length() == n) {
            res.add(Integer.parseInt(digital.toString()));
            return;
        }

        for (int i =0; i < 10; i++){
            int pre_digital = 0;
            if(digital.length() !=0){
                pre_digital =digital.charAt(digital.length() -1) -'0';
            }
            int dis = Math.abs(i- pre_digital);

            if(dis == k ){
                digital.append(i + "");
                dfs(n, k, digital, res);
                digital.deleteCharAt(digital.length() - 1);
            }
        }
    }
}
