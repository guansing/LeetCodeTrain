package weektest;

public class test5773 {
    public String maxValue(String n, int x) {
        // 首先要在 StringBuilder中插入 n,也就是将这个字符串以StringBuilder表示出来
        StringBuilder str = new StringBuilder(n);

        // 先判断正负
        if (n.charAt(0) == '-') {
            for (int i = 1; i < n.length(); i++) {
                if (n.charAt(i) - '0' > x) {
                    String str_x = x + "";
                    //System.out.println(str_x);
                    //System.out.println(str.insert(i,x).toString());
                    return str.insert(i,x).toString();
                }
            }
        } else {
            for (int i = 0; i < n.length(); i++) {
                if (n.charAt(i) - '0' < x) {
                    String str_x = x + "";
                    return str.insert(i,x).toString();
                }
            }
        }
        return n+x;
    }

//    public static void main(String[] args) {
//        test5773 test = new test5773();
//        String a = test.maxValue("-13", 2);
//        System.out.println(a);
//    }
}
