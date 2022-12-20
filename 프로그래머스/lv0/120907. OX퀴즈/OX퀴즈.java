class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] quizOX = quiz[i].split(" ");
            if (quizOX[1].equals("+")) {
                if (Integer.parseInt(quizOX[0]) + Integer.parseInt(quizOX[2]) == Integer.parseInt(quizOX[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else if (quizOX[1].equals("-")) {
                if (Integer.parseInt(quizOX[0]) - Integer.parseInt(quizOX[2]) == Integer.parseInt(quizOX[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                 }
             }
        }
        return answer;
    }
}