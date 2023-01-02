class Solution {   
    public int solution(String dirs) {
        int answer = 0;
        
                 // U  D   L  R
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};

        boolean[][][][] visit = new boolean[11][11][11][11];

        // 이동전 위치(x, y) 이동후 위치(nx, ny)
        int x = 0;
        int y = 0;
        int nx = 5;
        int ny = 5;

        // 위치로 사용할 인덱스
        int idx = 0;

        for (int i = 0; i < dirs.length(); i++) {
            x = nx;
            y = ny;
            if (dirs.charAt(i) == 'U') idx = 0;
            else if (dirs.charAt(i) == 'D') idx = 1;
            else if (dirs.charAt(i) == 'L') idx = 2;
            else if (dirs.charAt(i) == 'R') idx = 3;

            nx += dx[idx];
            ny += dy[idx];

            if (nx < 0 || ny < 0 || nx > 10 || ny > 10) {
                nx -= dx[idx];
                ny -= dy[idx];
                continue;
            }

            if (!visit[x][y][nx][ny] && !visit[nx][ny][x][y]) {
                visit[x][y][nx][ny] = true;
                visit[nx][ny][x][y] = true;
                answer++;
            }
        }
        return answer;
    }
}