class Solution {
    public int[] solution(int[][] score) {
        
         int[] answer = new int[score.length]; // 결과 담을 배열.
        double[] avg = new double[score.length]; // 스코어 담을 배열.

        for (int i = 0; i <score.length ; i++) {
            avg[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        for (int i = 0; i <score.length ; i++) {
            int count = 0;
            for (int j = 0; j <score.length ; j++) {
                if(avg[i] < avg[j]){
                    count++;
                }
            }
            answer[i] = count+1;
        }

        return answer;
    }
}