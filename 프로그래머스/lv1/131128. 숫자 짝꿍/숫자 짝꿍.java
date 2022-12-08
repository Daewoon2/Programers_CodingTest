import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";

        int[] a = new int[10];
        int[] b = new int[10];

        for (String tmp1 : X.split("")) {
            a[Integer.parseInt(tmp1)] += 1;
        }
        for (String tmp2 : Y.split("")) {
            b[Integer.parseInt(tmp2)] += 1;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            while (true) {
                if (a[i] == 0 || b[i] == 0) {
                    break;
                }
                sb.append(i);
                a[i]--;
                b[i]--;
            }
        }

        if ("".equals(sb.toString())) {
            answer = "-1";
        } else if ("0".equals(sb.toString().substring(0, 1))) {
            answer = "0";
        } else {
            answer = sb.toString();
        }

        return answer;
    }
}