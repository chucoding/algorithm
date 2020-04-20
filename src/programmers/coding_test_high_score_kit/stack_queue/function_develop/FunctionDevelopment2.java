package programmers.coding_test_high_score_kit.stack_queue.function_develop;

import java.util.Queue;
import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;

class FunctionDevelopment2 {
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        Queue<Integer> indexQ = new ArrayDeque<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<speeds.length; i++){
            indexQ.offer(i);
        }
        
        int cnt = 0;
        int j=0;
        while(!indexQ.isEmpty()){
            int i = indexQ.poll();
            progresses[i] += speeds[i];
            
            if(progresses[i] >= 100) {
                cnt++;
                System.out.println(i);
                if(i == j + cnt-1) {
                    list.add(cnt);                    
                    cnt = 0;
                    j++;
                }
                
            } else {
                indexQ.offer(i);
            }
        }
        
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
