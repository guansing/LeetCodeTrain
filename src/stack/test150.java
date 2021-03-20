package stack;

import java.util.Stack;

public class test150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (isNumber(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int num2 = stack.pop();
                int num1 = stack.pop();

                switch (token) {
                    case "+" :
                        stack.push(num1 + num2);
                        break;

                    case "-" :
                        stack.push(num1 - num2);
                        break;

                    case "*" :
                        stack.push(num1 * num2);
                        break;

                    case "/" :
                        stack.push(num1 / num2);
                        break;
                    default:
                }
            }
        }
        return stack.pop();
    }

    public boolean isNumber(String str) {
        return !(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/"));
    }

//    public boolean isNumber(String str) {
//        for (int i = 0; i < str.length(); i++) {
//            if (!Character.isDigit(str.charAt(i))) {
//                return false;
//            }
//        }
//        return true;
//    }
}
