package programmers.coding_test_high_score_kit.stack_queue.function_develop;

import java.util.List;
import java.util.ArrayList;

class FunctionDevelopment4 {
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<Integer>();
        int[] date = new int[progresses.length];
        
        for(int i=0; i<date.length; i++){
        	date[i] = (int) Math.ceil( (double) (100 - progresses[i]) / speeds[i]);
        }

        int count = 0;
        for(int i=0; i<date.length; i++) {
        	count++;
        	if(i == date.length-1) {
        		list.add(count);
        		break;
        	}
        	else if(date[i] < date[i+1]) {
        		list.add(count);
        		count = 0;
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
