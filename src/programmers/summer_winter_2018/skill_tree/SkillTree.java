package programmers.summer_winter_2018.skill_tree;

public class SkillTree {

	public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        char[] s = skill.toCharArray();

        for(int i=0; i<skill_trees.length; i++) {

        	int k=0;
        	for(int j=0; j<skill_trees[i].length(); j++) {
        		
        		if(skill_trees[i].charAt(j) == s[k]) k++;
        		if(k == skill.length()-1) {
        			answer++;
        			break;
        		}
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"});
	}
}
