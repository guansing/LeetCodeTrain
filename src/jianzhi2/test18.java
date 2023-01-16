package jianzhi2;

public class test18 {
    public boolean isPalindrome(String s) {
        s = trans(s);
        int left = 0;
        int right = s.length()-1;
        int len = s.length() / 2;

        // base case
        if(s.length() == 0) {
            return true;
        }
        if(s.length() == 1) {
            return false;
        }

        for(int i = 0; i < len; i++) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public String trans(String str) {
        // StringBuilder sb = new StringBuilder();
        String res = "";
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c - 'a' >= 0 && c - 'a' <= 25) {
                // sb.append(c);
                res += c;
            }

            if(c - 'A' >= 0 && c - 'A' <= 25) {
                int cur = c + 32;
                char cc = (char) Integer.parseInt(String.valueOf(cur));
                // sb.append(cc);
                res += cc;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        test18 test = new test18();
        boolean res = test.isPalindrome(" ");
        System.out.println(res);
    }
}
