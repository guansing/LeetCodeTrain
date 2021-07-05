package dp.track;

import java.util.Arrays;
import java.util.Comparator;

public class test354 {
    public int maxEnvelopes(int[][] envelopes) {
        int length = envelopes.length;
        // 按宽度升序排列，如果宽度一样，则按高度降序排列
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0];
            }
        });

        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = envelopes[i][1];
        }
        return lengthOfLTS(nums);
    }

    public int lengthOfLTS(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len+1];
        int index = 1;
        arr[index] = nums[0];
        for (int i = 1; i < len; i++) {
            if (arr[index] < nums[i]) {
                index = index + 1;
                arr[index] = nums[i];
            } else {
                int l = 1;
                int r = index;
                int pos = 0;
                while (l <= r) {
                    int mid = l + (r - l) / 2;
                    if (arr[mid] < nums[i]) {
                        pos = mid;
                        l = mid + 1;
                    } else {
                        r = mid - 1;
                    }
                }
                arr[pos + 1] = nums[i];
            }
        }
        return index;
    }
}
