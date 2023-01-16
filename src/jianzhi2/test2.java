package jianzhi2;

public class test2 {
    public String addBinary(String a, String b) {
        int a_len = a.length();
        int b_len = b.length();
        if(a_len < b_len) {
            for(int i = 0; i < b_len - a_len; i++) {
                a = '0' + a;
            }
        } else if(a_len > b_len) {
            for(int i = 0; i < a_len - b_len; i++) {
                b = '0' + b;
            }
        }
        int len = a.length();
        int carry = 0;
        String res = "";
        for(int i = len-1; i >= 0; i--) {
            int a_i = a.charAt(i) == '0' ? 0 : 1;
            int b_i = b.charAt(i) == '0' ? 0 : 1;
            int carry_i = (a_i + b_i + carry) % 2;
            carry = (a_i + b_i + carry) / 2;
            res = carry_i + res;
        }
        if(carry != 0) {
            res = carry + res;
        }
        return res;
    }

    public static void main(String[] args) {
        test2 t = new test2();
        String arr = t.addBinary("1", "111");
        System.out.println(arr.toString());
    }
}
