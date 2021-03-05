public class test283 {
    public void moveZeroes(int[] nums) {

        int [] copyNum = new int[nums.length];
        int now = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                copyNum[now] = nums[i];
                now +=1;
            }
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = copyNum[i];
        }
    }
}
