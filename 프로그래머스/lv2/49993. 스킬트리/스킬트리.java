class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String s : skill_trees) {
            String skillTree = s;

            for (int i = 0; i < s.length(); i++) {
                String str = String.valueOf(s.charAt(i));
                if (!skill.contains(str)) {
                    skillTree = skillTree.replace(str, "");
                }
            }
            if (skill.indexOf(skillTree) == 0) {
                answer++;
            }
        }

        return answer;
    }
}