import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> map = new HashMap<>();
        Map<String, Integer> idMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            map.put(name, new HashSet<>());
            idMap.put(name, i);
        }

        for (String s : report) {
            String[] arr = s.split(" ");
            String from = arr[0];
            String to = arr[1];
            map.get(to).add(from);
        }

        for (int i = 0; i < id_list.length; i++) {
            Set<String> mail = map.get(id_list[i]);
            if (mail.size() >= k) {
                for (String name : mail) {
                    answer[idMap.get(name)]++;
                }
            }
        }
        return answer;
    }
}