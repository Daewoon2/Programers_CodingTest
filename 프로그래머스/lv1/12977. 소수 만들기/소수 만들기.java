class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    int max = 0;
                    for (int x = 1; x < sum + 1; x++) {
                        if (sum % x == 0) max++;
                    }
                    if (max == 2) answer++;
                }
            }
        }
        return answer;
    }
}