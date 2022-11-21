import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        
       int[] answer;
        HashSet<Integer> answerSet = new HashSet<>();

        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                answerSet.add(numbers[i] + numbers[j]);
            }
        }
        ArrayList<Integer> sortList = new ArrayList<>(answerSet);
        answer = new int[sortList.size()];
        
        int j=0;
        for(int i : sortList){
            answer[j] = i;
            j++;
        }
        Arrays.sort(answer);
        return answer;
    }
}