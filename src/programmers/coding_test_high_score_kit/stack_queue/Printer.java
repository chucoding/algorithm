package programmers.coding_test_high_score_kit.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Printer {

	public static int solution(int[] priorities, int location) {
		int answer = 0;
		
		Queue<Integer> readyQueue = new LinkedList();
		Stack<Integer> stack = new Stack();
		
		for(int i=0; i<priorities.length; i++) {
			readyQueue.offer(priorities[i]);
		}
		
		while(true) {
			if(readyQueue.isEmpty()) break;
			
			int priority = readyQueue.poll();
			
			//비어있으면 스택에 추가
			if(stack.isEmpty()) {
				stack.push(priority);
				continue;
			}
			
			while(!stack.isEmpty()) {
				if(priority <= stack.peek() ) {
					stack.push(priority);
					break;
				} else {
					//큐의 마지막에 집어넣음
					int beforePriority = stack.pop();
					
					readyQueue.offer(priority);
					priority = readyQueue.poll();
					
//					orderStack.pop();
				} 

			}
			
			
			for(int i=0; i<readyQueue.size(); i++) {
				
			}
		}
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {2,1,3,2}, 2));
	}
}
