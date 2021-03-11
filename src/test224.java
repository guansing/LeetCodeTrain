import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class test224 {
    public static void main(String args[]) {
        String s = "3+2-2";
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char sign = '+';
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + (s.charAt(i) - '0');
                System.out.println(num);
            }
            if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == s.length() - 1) {
                switch (sign) {
                    case '+':
                        stack.push(+num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        int topNum1 = stack.peek();
                        stack.pop();
                        stack.push(topNum1 * num);
                        break;

                    case '/':
                        int topNum2 = stack.peek();
                        stack.pop();
                        stack.push(topNum2 / num);
                        break;
                }
                sign = s.charAt(i);
                num = 0;
            }
        }
        int res = 0;
        while (!stack.empty()) {
            res = res + stack.peek();
            stack.pop();
        }

        System.out.println(res);
    }
}