import java.util.Stack;

public class test20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        // 这里出错了，之前写成 stack.size == 0
        if (s.length() == 0) {
            return true;
        }

        for (int i = 0; i < s.length(); i++) {

            // 等同于遍历对象
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()){
                    return false;
                }else {
                    if (c == ')') {
                        if (stack.peek() != '(') {
                            return false;
                        }

                        else if (stack.peek() == '('){
                            stack.pop();
                        }
                    }

                    else if (c == ']') {
                        if (stack.peek() != '[') {
                            return false;
                        }

                        else if (stack.peek() == '['){
                            stack.pop();
                        }
                    }

                    else if (c == '}') {
                        if (stack.peek() != '{') {
                            return false;
                        }

                        else if (stack.peek() == '{'){
                            stack.pop();
                        }
                    }
                }
            }
        }
        return stack.isEmpty()? true:false;
    }
}
