class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        String str = A;
        for(int i = 0 ; i < A.length() ; i++){
            if(str.equals(B)){
                answer = i;
                break;
            }
            str = str.charAt(A.length()-1) + str.substring(0, A.length()-1);

        }
        return answer;
    }
}