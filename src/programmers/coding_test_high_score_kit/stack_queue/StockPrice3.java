package programmers.coding_test_high_score_kit.stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class StockPrice3 {

	public static int[] solution(int[] prices) {

		int[] answer = new int[prices.length];
        
        Deque<Integer> stack = new ArrayDeque<Integer>();
		int i=0; 

		stack.push(i);
		for(i=1; i<prices.length; i++) {
			while(!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
				int pre = stack.pop();
				prices[pre] = i - pre;
			}
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			int pre = stack.pop();
			answer[pre] = i - pre -1;
		}
		
        return answer;
    }

	public static void main(String[] args) {
//		solution(new int[] {1,2,3,2,3});
//		solution(new int[] {1,2,9,2,3,4,5,4,1,3,3});
//		solution(new int[] {1,2,3,4,3,2,3});
		solution(new int[] {1,2,3,2,3,2,1,0});
	}
}
