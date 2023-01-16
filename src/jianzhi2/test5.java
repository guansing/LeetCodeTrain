package jianzhi2;

public class test5 {
    public int maxProduct(String[] words) {
        int res = 0, len = words.length;
        int[] nums = new int[len];
        for(int i = 0; i < len; i++){
            for(int j = 0, size = words[i].length(); j < size; j++){
                nums[i] |= 1 << (words[i].charAt(j) - 'a');
            }
        }
        for(int i = 0; i < len; i++){
            for(int j = i + 1; j < len; j++){
                if((nums[i] & nums[j]) == 0) {
                    res = Math.max(res, words[i].length() * words[j].length());
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        test5 s = new test5();
        String[] ss = {"bb", "cd"};
        int bb = s.maxProduct(ss);
        System.out.println(bb);

    }
}
