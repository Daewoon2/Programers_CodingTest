import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> sameList = new ArrayList<>();
        ArrayList<String> sumList = new ArrayList<>();

        // 두개씩 잘라서 집합 만들기
        //FR, RA, AN, NC, CE
        for (int i = 0; i < str1.length() - 1; i++) {
            char a = str1.charAt(i);
            char b = str1.charAt(i + 1);

            if (Character.isLetter(a) && Character.isLetter(b)) {
                String str = Character.toString(a) + Character.toString(b);
                list1.add(str);
            }
        }

        // FR, RE, EN, NC, CH
        for (int i = 0; i < str2.length() - 1; i++) {
            char a = str2.charAt(i);
            char b = str2.charAt(i + 1);

            if (Character.isLetter(a) && Character.isLetter(b)) {
                String str = Character.toString(a) + Character.toString(b);
                list2.add(str);
            }
        }
        // 중복 처리 위해 둘다 정렬
        //list1 = AN, CE, FR, NC, RA
        //list2 = CH, EN, FR, NC, RE
        

        // 교집합
        // samList = FR, NC
        // sumList = AN, CE, FR, NC, RA
        for (String str : list1) {
            if (list2.remove(str)) { // 집합1에 집합2가 포함된다면 삭제후, 교집합에 추가
                sameList.add(str);
            }
            sumList.add(str);
        }

        // 합집합
        // samList = FR, NC = 2
        // sumList = AN, CE, FR, NC, RA, CH, EN, RE = 8
        for (String str : list2) {  // 교집합에서 제외된 것 뺀 나머지 합집합에 추가
            sumList.add(str);
        }

        double jakard = 0;

        // jakard = 2 / 8
        if (sumList.size() == 0) {
            jakard = 1;
        } else {
            jakard = (double) sameList.size() / (double) sumList.size();
        }

        return (int) (jakard * 65536);
    }
}