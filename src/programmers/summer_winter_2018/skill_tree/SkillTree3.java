package programmers.summer_winter_2018.skill_tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SkillTree3 {

	public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        long a = System.nanoTime();
        
        ArrayList list = new ArrayList(Arrays.asList(skill.toCharArray()));
        answer = skill_trees.length;
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
