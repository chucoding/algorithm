package programmers.coding_test_high_score_kit.stack_queue.function_develop;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class FunctionDevelopment2 {

	public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Deque<Integer> q = new ArrayDeque<Integer>();
        List<Integer> l = new ArrayList<Integer>();

        for(int i=0; i<speeds.length; i++) {
        	q.offer(i);
        }
        
        int count = 0;
        while(!q.isEmpty()) {

        	int size = q.size();
        	
        	for(int i=0; i<size; i++) {
        		int j= q.pop();
        		progresses[j] += speeds[j];
        		q.offer(j);
        	}
        	
        	int cnt = 0;
	    	 for(int i=0; i<size; i++) {
	    		 if(progresses[q.peek()] >= 100) {
	    			 cnt++;
	    			 q.poll();
	    		 } else break;
	    	 }
        	
	    	 if(cnt != 0) {
	    		 l.add(cnt);
	    	 }
        	
        }
        
        answer = new int[l.size()];
        for(int i=0; i<l.size(); i++) {
        	answer[i] = l.get(i);
        }

        return answer;
    }
	 
	 public static void main(String[] args) {
		
		 int[] progresses = {93, 30, 55};
		 int[] speeds = {1, 30, 5};
		 
		 int[] result = solution(progresses, speeds);
		 
	}
}
