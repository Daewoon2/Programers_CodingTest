import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        // 배열 역순으로 tScore 배열에 담기
        Arrays.sort(score);
        int[] tScore = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            tScore[i] = score[score.length - 1 - i];
        }

        int idx = 0;

        while (true) {
            if (idx >= tScore.length || idx + m > tScore.length) {
                break;
            }
            answer += tScore[idx + m - 1] * m;
            idx += m;
        }
        return answer;
    }
}