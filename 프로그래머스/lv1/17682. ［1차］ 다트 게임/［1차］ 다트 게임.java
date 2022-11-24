import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
       
        stack.push(0);
        for (int i = 0; i< dartResult.length(); i++) {
            if (dartResult.charAt(i) == '#') {
                int num = stack.pop();

                stack.push(num*-1);
            }
            else if (dartResult.charAt(i) == '*') {
                int num = stack.pop();
                int num2 = stack.pop();
                stack.push(num2*2);
                stack.push(num*2);
            }
            else if (dartResult.charAt(i) == 'S') {
                int num = stack.pop();
                stack.push(num);
            }
            else if (dartResult.charAt(i) == 'D') {
                int num = stack.pop();
                stack.push(num*num);
            }
            else if (dartResult.charAt(i) == 'T') {
                int num = stack.pop();
                stack.push(num*num*num);
            }else {
                char num = dartResult.charAt(i);
                char num2 = dartResult.charAt(i+1);
                if(num=='1' && num2=='0') {
                    stack.push(10);
                    i++;
                }else {
                    stack.push(Integer.parseInt(String.valueOf(dartResult.charAt(i))));
                }
            }
        }
        answer = stack.pop()+stack.pop()+stack.pop();
        return answer;
    }
}