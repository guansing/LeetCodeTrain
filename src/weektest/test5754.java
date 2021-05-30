package weektest;

public class test5754 {
    public int countGoodSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length()-2; i++) {
            if (s.charAt(i) != s.charAt(i+1) && s.charAt(i+1) != s.charAt(i+2) && s.charAt(i+2) != s.charAt(i)) {
                count = count + 1;
            }
        }
        return count;
    }
}
