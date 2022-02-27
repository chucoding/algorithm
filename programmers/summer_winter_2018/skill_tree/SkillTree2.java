package programmers.summer_winter_2018.skill_tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SkillTree2 {

	public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        long a = System.nanoTime();
        
        ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
        Iterator<String> it = skillTrees.iterator();

        while (it.hasNext()) {
            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
                it.remove();
            }
        }
        answer = skillTrees.size();
        
        long b = System.nanoTime();
        System.out.println(b-a);
        
        return answer;
    }
	
	public static void main(String[] args) {
		solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"});
	}
}
