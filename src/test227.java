import com.sun.javafx.logging.JFRInputEvent;

import java.util.Stack;

public class test227 {
    public static void main(String args[]) {
//        String s = "458";
//
//        int b = Integer.valueOf(s).intValue();
//        System.out.println(s + 1);
//        System.out.println(b+1);
        // 不含有空格的 String 类型的字符串的数学表达式
        String s = "3+2-2";
        //String s1 = "(1+(4+5+2)-3)+(6+8)";
        Stack<Integer> stack = new Stack<>();
        // 记录算式中的数字
        int num = 0;
        // 记录 num 前的符号，初始化为 +
        char sign = '+';
        // 遍历题目中给出字符串
        for (int i = 0; i < s.length();i++) {
            // 将字符串中每一个字符都拆出来
            //char c = s.charAt(i);
            // Character.isDigit() 方法在 Java 中用于判断指定字符是否为数字
            // 但下面注释掉的这种最大局限性是只能够计算十以内的运算
//            if (Character.isDigit(c)) {
//                num = Integer.parseInt(String.valueOf(c));
//            }
            // 以下代码才能计算两位以及两位以上的运算
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + (s.charAt(i) - '0');
                System.out.println(num);
            }

            // System.out.println("==================");


            // 如果是非数字类型的字符，也就是运算符号，那么通过switch语句判断
            // 当符号 sign='+' 的时候，相当于数字前面的符号是 + ，反之 -
            if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == s.length()-1) {
                switch (sign) {
                    case '+' :
                        stack.push(+num);
                        break;
                    case '-' :
                        stack.push(-num);
                        break;
                    case '*' :
                        int topNum1 = stack.peek();
                        stack.pop();
                        stack.push(topNum1 * num);
                        break;

                    case '/' :
                        int topNum2 = stack.peek();
                        stack.pop();
                        stack.push(topNum2 / num);
                        break;
                }
                sign = s.charAt(i);
                // 如果不将 num 清空，就会导致最终的数值会在上一个数值的基础上进行 10 * num 的这个运算！！！
                num = 0;
            }
        }
        int res = 0;
        while (!stack.empty()) {
            res = res + stack.peek();
            stack.pop();
        }

        //return res;

        System.out.println(res);
    }
}
