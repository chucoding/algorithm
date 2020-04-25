package programmers.summer_winter_2018.skill_tree;

public class SkillTree3 {

	public static int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;

        long a = System.nanoTime();
        
        for(int i=0; i<skill_trees.length; i++){
            if(skill.indexOf(skill_trees[i].replaceAll("[^"+skill+"]",""))!=0) {
                answer--;
            }    
        }
        
        long b = System.nanoTime();
        System.out.println(b-a);
        
        return answer;
    }
	
	public static void main(String[] args) {
		solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"});
	}
}
