class Solution {
    public String solution(int[] food) {
        String answer = "";
        String str = "";

        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                str += Integer.toString(i);
            }
        }

        StringBuffer sb = new StringBuffer(str);
        answer = str + 0 + sb.reverse();

        return answer;
    
    }
}