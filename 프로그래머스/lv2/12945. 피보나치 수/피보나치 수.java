class Solution {
    public int solution(int n) {
      int[] answer = new int[n + 1];

        for (int i = 0; i < answer.length; i++) {
            if (i == 0) {
                answer[i] = 0;
            } else if (i == 1) {
                answer[i] = 1;
            } else {
                int fibo = answer[i - 2] + answer[i - 1];
                answer[i] = fibo % 1234567;
            }
        }
        return answer[n];
    }
}