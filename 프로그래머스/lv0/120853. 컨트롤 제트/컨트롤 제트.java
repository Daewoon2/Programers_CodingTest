import java.util.Stack;
import java.util.ArrayList;

class Solution {
    public int solution(String s) {
  int answer = 0;
        String[] str = s.split(" ");

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < str.length; i++){
            if(str[i].equals("Z")){
                    arrayList.remove(arrayList.size() - 1);
            }
            else{
                arrayList.add(Integer.parseInt(str[i]));
        }
        }
        for(int x : arrayList){
            answer += x;
        }
        return answer;
        
        //스택으로 풀기
//        Stack<Integer> stack = new Stack<>();
//        int answer = 0;
//        String[] arr = s.split(" ");
//        for (int i = 0; i < arr.length; i++) {
//            if (!arr[i].equals("Z")) {
//                stack.push(Integer.parseInt(arr[i]));
//            } else stack.pop();
//        }
//
//        while (stack.size() != 0) {
//            answer += stack.pop();
//        }
//        return answer;
    }
}