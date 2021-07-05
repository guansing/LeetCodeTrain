package binary_search;

public class test300 {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len+1];
        if (len == 0) {
            return 0;
        }
        int index = 1;
        arr[index] = nums[0];
        for (int i = 1; i < len; i++) {
            if (nums[i] > arr[index]) {
                index = index + 1;
                arr[index] = nums[i];
            } else {
                int l = 1;
                int r = index;
                int pos = 0;
                while (l <= r) {
                    int mid = l + (r - l) >> 1;
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
