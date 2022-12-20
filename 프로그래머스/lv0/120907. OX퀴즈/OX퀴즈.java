class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        // [ 0 1 2 3  4 ,  0 1 2 3 4
        // ["3 - 4 = -3", "5 + 6 = 11"]
        for (int i = 0; i < quiz.length; i++) {
            String[] quizOX = quiz[i].split(" ");
            int front = Integer.parseInt(quizOX[0]);
            int back = Integer.parseInt(quizOX[2]);
            int result = Integer.parseInt(quizOX[4]);
            
            if (quizOX[1].equals("+")) {
                if (front + back == result) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else if (quizOX[1].equals("-")) {
                if (front - back == result) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}