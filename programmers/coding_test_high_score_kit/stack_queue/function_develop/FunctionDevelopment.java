package programmers.coding_test_high_score_kit.stack_queue.function_develop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FunctionDevelopment {

	 public static int[] solution(int[] progresses, int[] speeds) {
	     int[] answer = {};
	  
	     Queue<Integer> sliceQ = new LinkedList();
	     Queue<Integer> processQ = new LinkedList();
	     List<Integer> list = new ArrayList();

	     for(int i=0; i<progresses.length; i++) {
	    	 processQ.add(progresses[i]);
	    	 sliceQ.add(speeds[i]);
	     }
	     
	     while(!processQ.isEmpty()) {

	    	 int size = processQ.size();

	    	 for(int i=0; i<size; i++) {
	    		 int curProcess = processQ.remove();
	    		 int curSpeed = sliceQ.remove();
	    		 
	    		 curProcess += curSpeed;
	    		 
	    		 processQ.add(curProcess);
	    		 sliceQ.add(curSpeed);
	    	 }

	    	 int cnt = 0;
	    	 for(int i=0; i<size; i++) {
	    		 if(processQ.peek() >= 100) {
	    			 cnt++;
	    			 processQ.remove();
	    			 sliceQ.remove();
	    		 } else {
	    			 break;
	    		 }
	    	 }
	    	 
	    	 if(cnt != 0) {
	    		 list.add(cnt);
	    	 }
	     }
	     
	     answer = new int[list.size()];
	     for(int i=0; i<list.size(); i++) {
	    	 answer[i] = list.get(i);
	     }
	     
	     return answer;
	 }
	 
	 public static void main(String[] args) {
		
		 int[] progresses = {93, 30, 55};
		 int[] speeds = {1, 30, 5};
		 
		 int[] result = solution(progresses, speeds);
		 
	}
}
