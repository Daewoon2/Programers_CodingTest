import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] numlist, int n) {
         for (int i = 0; i < numlist.length - 1; i++) {
            for (int j = i + 1; j < numlist.length; j++) {

                int a = Math.abs(numlist[i] - n);
                int b = Math.abs(numlist[j] - n);
                if (a > b || (a == b && numlist[i] < numlist[j])) {

                    int tmp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = tmp;
                }

            }
        }
        return numlist;
    }
}