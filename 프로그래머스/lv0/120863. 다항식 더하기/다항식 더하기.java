import java.util.*;

class Solution {
    public String solution(String polynomial) {
        int xCnt = 0;
        int num = 0;

        for (String s : polynomial.split(" ")) {
            if (s.contains("x")) {
                xCnt += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x", ""));
            }
            else if (!s.contains("+")) {
                num += Integer.parseInt(s);
            }
        }

        return (xCnt != 0 ? xCnt > 1 ? xCnt + "x" : "x" : "") + 
                (num != 0 ? (xCnt != 0 ? " + " : "") + num : xCnt == 0 ? "0" : "");
    }
}