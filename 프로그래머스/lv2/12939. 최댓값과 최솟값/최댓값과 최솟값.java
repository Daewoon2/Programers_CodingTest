class Solution {
    public String solution(String s) {
        String answer = "";

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);

            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        answer = min + " " + max;

        return answer;
    }
}