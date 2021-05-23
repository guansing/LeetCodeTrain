package weektest;

public class test1844 {
    public String replaceDigits(String s) {
        char[] cs = s.toCharArray();
        for (int i = 1; i < s.length(); i += 2) {
            cs[i] = (char) (cs[i - 1] + (cs[i] - '0'));
        }
        return new String(cs);
    }
}
