import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0, 0};

        int zero = 0; // 0의 갯수
        int win = 0; // 맞힌번호 갯수

        for (int x : lottos) {
            if (x == 0) {
                zero++;
            } else {
                for (int y : win_nums) {
                    if (x == y) {
                        win++;
                    }
                }
            }
        }
        
        answer[0] = (zero + win) > 1 ? 7 - (zero + win) : 6;
        answer[1] = win > 1 ? 7 - win : 6;

        return answer;
    }
}