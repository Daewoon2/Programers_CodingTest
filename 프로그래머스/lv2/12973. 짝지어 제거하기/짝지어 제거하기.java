import java.util.*;

class Solution{
    public int solution(String s){
        Stack<Character> stack = new Stack<>();

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                if (stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        System.out.println(stack);
        
        return stack.size() == 0 ? 1 : 0;
    }
}