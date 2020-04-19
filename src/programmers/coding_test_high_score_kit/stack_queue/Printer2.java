package programmers.coding_test_high_score_kit.stack_queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Printer2 {

	public static int solution(int[] priorities, int location) {
        int answer = 0;
        
        long a = System.nanoTime();
        
        Queue<Integer> q = new LinkedList<Integer>();
        
        for(int i=0; i<priorities.length; i++) {
        	q.offer(priorities[i]);
        }
        
        Arrays.sort(priorities);
        int size = priorities.length -1;
        
        while(!q.isEmpty()) {
        	Integer prior = q.poll();
        	if(prior == priorities[size - answer]) {
        		answer++;
        		location--;
        		if(location < 0) break;
        	} else {
        		q.offer(prior);
        		location--;
        		if(location < 0) location = q.size()-1;
        	}
        }
        
        long b = System.nanoTime();
        System.out.println(b-a);
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,6,3,1,2,5,6,7,2,3}, 3));
		System.out.println(solution(new int[] {2,1,3,2}, 2));
		System.out.println(solution(new int[] {1,1,9,1,1,1}, 0));
	}
}
