class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int k = 0;
        int sum = 0;
        for (int j = 1; j <= number; j++) {
            for (int i = 1; i * i <= j; i++) {
                if (i * i == j) {
                    k++;
                } else if (j % i == 0) {
                    k += 2;
                }
            }
            if (k > limit) {
                k = power;
                sum = sum + k;
                k = 0;
            } else {
                sum = sum + k;
                k = 0;
            }
        }
        answer = sum;
        return answer;
    }
}