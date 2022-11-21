import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int max = nums.length / 2;
        Set<Integer> hashSet = new HashSet<>();
        for (int x : nums) {
            hashSet.add(x);
        }
        if (max < hashSet.size()){
            return max;
        } else {
            return hashSet.size();
        }
                //스트림으로 풀기
//        int answer = nums.length / 2;
//
//        int typeCnt = (int) Arrays.stream(nums).distinct().count();
//
//        return typeCnt < answer ? typeCnt : answer;
    }
}