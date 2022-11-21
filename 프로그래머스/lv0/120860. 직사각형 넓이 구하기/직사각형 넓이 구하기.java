class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        int min_X = Integer.MAX_VALUE;
        int max_X = Integer.MIN_VALUE;
        int min_Y = Integer.MAX_VALUE;
        int max_Y = Integer.MIN_VALUE;

        for(int i=0; i<dots.length; i++){

            int x = dots[i][0];
            int y = dots[i][1];
            if(x<min_X) min_X = x;
            if(x>max_X) max_X = x;
            if(y<min_Y) min_Y = y;
            if(y>max_Y) max_Y = y;

        }

        answer = (max_X-min_X)*(max_Y-min_Y);

        return answer;
    }
}