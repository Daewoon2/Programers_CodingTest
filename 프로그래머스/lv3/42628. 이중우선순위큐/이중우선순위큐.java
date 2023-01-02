import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0, 0};
        PriorityQueue<Integer> queueMin = new PriorityQueue();
        PriorityQueue<Integer> queueMax = new PriorityQueue(Comparator.reverseOrder());

        for (String operation : operations) {
            String[] arr = operation.split(" ");

            if (arr[0].equals("I")) {
                queueMin.add(Integer.parseInt(arr[1]));
                queueMax.add(Integer.parseInt(arr[1]));
            }
            if (arr[0].equals("D")) {
                if (!queueMax.isEmpty()) {
                    if (arr[1].equals("1")) {
                        int max = queueMax.peek();
                        queueMax.remove(max);
                        queueMin.remove(max);
                    } else {
                        int min = queueMin.peek();
                        queueMax.remove(min);
                        queueMin.remove(min);
                    }
                }
            }
            if (!queueMax.isEmpty()) {
                answer[0] = queueMax.peek();
                answer[1] = queueMin.peek();
            }
        }

        return answer;
    }
}