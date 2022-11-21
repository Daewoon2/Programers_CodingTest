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
    }
}