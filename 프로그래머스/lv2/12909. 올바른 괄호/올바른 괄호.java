import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<String> stack = new Stack<>();

        if (s.charAt(0) == ')') return false;

        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && s.charAt(i) == ')') {
                stack.pop();
            } else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }

        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}