import java.util.*;

class Solution {
    public int[] solution(String s) {
        Set<String> set = new LinkedHashSet<>();
        String[] str = s.substring(1, s.length() - 1).split("},");
        // {2}, {2,1}, {2,1,3}, {2,1,3,4,}
        
        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].replace("{", "");
            str[i] = str[i].replace("}", "");
        }
        // 2, 2,1, 2,1,3, 2,1,3,4

        Arrays.sort(str, new Comparator<String>(){
            public int compare(String o1, String o2){

                return Integer.compare(o1.length(), o2.length());
            }  // 2,1,3,4   2,1,3,   2,1,   2
        });
       

        for (String a : str) {
            String[] arr = a.split(",");
            // 2, 1, 3, 4, 2, 1, 3, 2, 1, 2
            
            for (String b : arr) {
                set.add(b); // 2, 1, 3, 4
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