package programmers.summer_winter_2018.skill_tree;

import java.util.LinkedList;

public class SkillTree {

	public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        long a = System.nanoTime();
        
        char[] s = skill.toCharArray();
        LinkedList<Character> list = new LinkedList<Character>();
        
        for(int i=0; i<skill_trees.length; i++) {
        	
        	for(int j=0; j<s.length; j++) {
            	list.add(s[j]);
            }
        	
        	boolean b = true;
        	
        	for(int j=0; j<skill_trees[i].length(); j++) {
        		
        		if(!list.isEmpty() && skill_trees[i].charAt(j) == list.getFirst()) list.removeFirst();
        		else {
        			for(int k=0; k<list.size(); k++) {
        				if(skill_trees[i].charAt(j) == list.get(k)) {
        					b = false;
        					list.remove(k);
        					break;
        				}
        			}
        		}
        		
        		if(!b) break;
        	}
        	
        	list.clear();
        	if(b) answer++;
        }
        
        long b = System.nanoTime();
        System.out.println(b-a);
        
        return answer;
    }
	
	public static void main(String[] args) {
		solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"});
	}
}
