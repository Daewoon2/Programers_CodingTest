import java.util.ArrayList;
import java.util.List;

class Solution {
   static String[] arr;
    static List<String> list;

    public int solution(String word) {
        int answer = 0;

        arr = new String[]{"A", "E", "I", "O", "U"};
        list = new ArrayList<>();
        compare(word, "", 0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(word)) {
                answer = i;
                break;
            }
        }


        return answer;
    }

    void compare(String word, String str, int count) {
        list.add(str);

        if (count > 4) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            compare(word, str + arr[i], count + 1);
        }
    }
}