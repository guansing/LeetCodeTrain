package string;

public class test27 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n-1];
                n--;
            } else {
                i++;
            }
        }
        return n;











//        int i = 0;
//        int j = nums.length - 1;
//
//        while (i < j) {
//            while (i < j && nums[i] != val) {
//                i++;
//            }
//
//            while (i < j && nums[j] == val) {
//                j--;
//            }
//            int temp = nums[i];
//            nums[i] = nums[j];
//            nums[j] = temp;
//        }
//        return nums[i] == val? i : i+1;

        // +++++++++++++++++++++++++++++++


//        int [] copyNum = new int[nums.length];
//        int now = 0;
//
//
//        for (int i=0; i <nums.length;i++) {
//            if (nums[i] != val) {
//                copyNum[now] = nums[i];
//                now++;
//            }
//        }
//
//        for (int i = 0;i < nums.length;i++) {
//            nums[i] = copyNum[i];
//        }
//        return now;
    }
}





