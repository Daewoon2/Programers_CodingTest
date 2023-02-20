import java.util.*;

class Solution {
    public int[] solution(String msg) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        // 해쉬 알파벳으로 초기화
        char ch = 'A';
        for (int i = 1; i < 27; i++) {
            map.put(ch + "", i);
            ch += 1;
        }

        for (int i = 0; i < msg.length(); i++) {
            int idx = i + 1;

            while (idx <= msg.length()) {
                // idx가 문자의 끝까지 도달하면 해당 인덱스를 결과 배열에 추가
                // 초기 반복문을 빠져나오기 위해 i를 idx로 초기화
                if (idx == msg.length()) {
                    arr.add(map.get(msg.substring(i)));
                    i = idx;
                    break;
                }
                // 다음 키 미리 계산
                String nextKey = msg.substring(i, idx + 1);
                // 다음 키가 있을경우 문자를 하나 추가하기 위해 idx 증가
                if (map.containsKey(nextKey)) idx++;
                    // 다음 키가 없을경우
                else {
                    // 결과 배열에 현재 키의 인덱스를 추가
                    arr.add(map.get(msg.substring(i, idx)));
                    // 현재 해쉬에 없는 다음키를 해쉬에 추가
                    map.put(nextKey, map.size() + 1);
                    // 문자의 idx-1 까지 처리 했음으로 i를 idx-1로 초기화
                    // (밖에 반복문 시작시 i++ 됨으로 idx-1로 초기화)
                    i = idx - 1;
                    break;
                }
            }
        }
        // ArrayList를 int[]로 변환
        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}