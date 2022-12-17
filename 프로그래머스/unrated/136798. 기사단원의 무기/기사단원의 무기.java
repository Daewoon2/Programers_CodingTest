class Solution {
    public int solution(int number, int limit, int power) {
       int answer = 0;

        int[] person = new int[number + 1];

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                person[i * j]++;
            }
        }

        for (int i = 1; i <= number; i++) {
            if (person[i] > limit) {
                answer += power;
            } else {
                answer += person[i];
            } 
        }
        return answer;
    }
}