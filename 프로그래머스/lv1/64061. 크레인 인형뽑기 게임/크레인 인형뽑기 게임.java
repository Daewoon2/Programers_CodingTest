import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][pos - 1] != 0) { // 0번인덱스 부터 있으니깐 pos-1, 0이 아니면 인형
                    int tmp = board[i][pos - 1];
                    board[i][pos - 1] = 0;
                    if (tmp == stack.peek()) {
                        stack.pop();
                        answer += 2;
                    } else stack.push(tmp);
                    break;
                }
            }
        }


        return answer;
    }
}