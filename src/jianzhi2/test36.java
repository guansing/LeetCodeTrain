package jianzhi2;

import java.util.Stack;

public class test36 {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int cur = 0;
        String pre = tokens[0];
        stack.push(tokens[0]);
        for(int i = 1; i < tokens.length; i++) {
            if(tokens[i] == "+") {
                cur = Integer.parseInt(pre) + Integer.parseInt(stack.peek());
                stack.pop();
                stack.pop();
                stack.push(cur + "");
            }
            else if(tokens[i] == "-") {
                cur = Integer.parseInt(pre) - Integer.parseInt(stack.peek());
                stack.pop();
                stack.pop();
                stack.push(cur + "");
            }
            else if(tokens[i] == "*") {
                cur = Integer.parseInt(pre) * Integer.parseInt(stack.peek());
                stack.pop();
                stack.pop();
                stack.push(cur + "");
            }
            else if(tokens[i] == "/") {
                cur = Integer.parseInt(pre) / Integer.parseInt(stack.peek());
                stack.pop();
                stack.pop();
                stack.push(cur + "");
            }
            else {
                stack.push(tokens[i]);
            }
            pre = stack.peek();
        }
        return cur;
    }

    public static void main(String[] args) {
        test36 t = new test36();
        String[] str = new String[]{"2", "1", "+", "3", "*"};
        int res = t.evalRPN(str);
        System.out.println(res);
    }
}
