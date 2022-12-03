import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][pos - 1] != 0) { // 0번인덱스 부터 있으니깐 pos-1, 0이 아니면 인형
                    int tmp = board[i][pos - 1];
                    if (!stack.isEmpty() && tmp == stack.peek()) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(tmp);
                    }
                    board[i][pos - 1] = 0;
                    break;
                }
            }
        }


        return answer;
    }
}