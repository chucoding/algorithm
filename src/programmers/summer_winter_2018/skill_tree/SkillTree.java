package programmers.summer_winter_2018.skill_tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class SkillTree {

	public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        char[] s = skill.toCharArray();
        Deque<Character> q = new ArrayDeque<Character>();
        
        int t = 0;
        for(int i=0; i<skill_trees.length; i++) {

        	for(int j=t; j<s.length; j++) {
            	q.offer(s[j]);
            }
        	
        	boolean b = true;
        	
        	for(int j=0; j<skill_trees[i].length(); j++) {

        		if(!q.isEmpty() && skill_trees[i].charAt(j) == q.peek()) q.poll();
        		else {
        			while(!q.isEmpty()) {
        				if(skill_trees[i].charAt(j) == q.poll()) {
        					b = false;
        					t++; 
        					//중간삭제?? list필요
        					break;
        				}
        			}
        		}
        		if(!b) break;
        	}
        	
        	q.clear();
        	if(b) answer++;
        }
        
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"});
	}
}
