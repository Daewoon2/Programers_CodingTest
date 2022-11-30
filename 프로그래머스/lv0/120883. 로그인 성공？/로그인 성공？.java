import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        for (int i = 0; i < db.length; i++) {
            if (db[i][0].equals(id_pw[0])) {
                if (db[i][1].equals(id_pw[1])) {
                    return "login";
                } else return "wrong pw";
            } 
        }
        return "fail";
        
        //        String answer = "";
//        //["meosseugi", "1234"]
//        HashMap<String, String> db_Map = new HashMap<>();
//
//        for (String[] str : db) {
//            db_Map.put(str[0], str[1]);
//            //["rardss", "123"],
//            // ["yyoom", "1234"],
//            // ["meosseugi", "1234"]
//
//            if (db_Map.containsKey(id_pw[0])) { //아이디가 있을 때
//                if (db_Map.get(str[1]).equals(id_pw[1])) { // 아이디 비밀번호 둘다 같을 때
//                    answer = "login";
//                } else answer = "wrong pw";
//            } else answer = "fail";
//        }
//
//        return answer;
    }
}