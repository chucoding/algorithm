package programmers.coding_test_high_score_kit.stack_queue.function_develop;

import java.util.List;
import java.util.ArrayList;
import java.util.Deque;
import java.util.ArrayDeque;

class FunctionDevelopment3 {
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<Integer>();
        Deque<Integer> q = new ArrayDeque<Integer>();
        
        for(int i=0; i<progresses.length; i++){
            int date = (int) Math.ceil( (double) (100 - progresses[i]) / speeds[i]);
            while(!q.isEmpty() && q.peek() < date){
                list.add(q.size());
                q.clear();
            }
            
            q.offer(date);
        }
        
        list.add(q.size());
        
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
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
