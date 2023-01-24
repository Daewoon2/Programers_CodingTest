import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        // 2,1,3,2
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        for (int a : priorities) {
            queue.add(a);
            // 3,2,2,1
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == queue.peek()) {
                    if (i == location) {
                        answer++;
                        return answer;
                    } else {
                    queue.poll();
                    answer++;
                    
                    } 
                }
            }
        }
        return answer;
    }
}