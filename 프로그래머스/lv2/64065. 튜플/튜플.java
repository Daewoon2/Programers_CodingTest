import java.util.*;

class Solution {
    public int[] solution(String s) {
        Set<String> set = new LinkedHashSet<>();
        String[] str = s.substring(1, s.length() - 1).split("},");
        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].replace("{", "");
            str[i] = str[i].replace("}", "");
        }

        Arrays.sort(str, (a, b) -> (a.length() - b.length()));
        for (String a : str) {
            String[] arr = a.split(",");
            for (String b : arr) {
                set.add(b);
            }
        }

        int[] answer = new int[set.size()];
        int cnt = 0;
        for (String c : set) {
            answer[cnt++] = Integer.parseInt(c);
        }
        return answer;
    }
}