import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        //["meosseugi", "1234"]
        HashMap<String, String> db_Map = new HashMap<>();

        for (String[] str : db) {
            db_Map.put(str[0], str[1]);
            //["rardss", "123"],
            // ["yyoom", "1234"],
            // ["meosseugi", "1234"]

            if (db_Map.containsKey(id_pw[0])) {
                if (db_Map.get(id_pw[0]).equals(id_pw[1])) {
                    answer = "login";
                } else answer = "wrong pw";
            } else answer = "fail";
        }

        return answer;
    }
}