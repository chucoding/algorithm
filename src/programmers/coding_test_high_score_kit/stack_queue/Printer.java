package programmers.coding_test_high_score_kit.stack_queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Printer {

	public static int solution(int[] priorities, int location) {
		int answer = 0;

		Deque<Integer> stack = new ArrayDeque<Integer>();
		Queue<Integer> valueQueue = new LinkedList<Integer>();
		Queue<Integer> orderQueue = new LinkedList<Integer>();

		for(int i=0; i<priorities.length; i++){
			valueQueue.offer(priorities[i]);
			orderQueue.offer(i);
		}

		Arrays.sort(priorities);

		for(int i=0; i<priorities.length; i++){
			stack.push(priorities[i]);
		}

		int priority = 0;
		if(!stack.isEmpty()) priority = stack.pop();

		while(!orderQueue.isEmpty() || !stack.isEmpty()){

			int o = orderQueue.poll();
			int v = valueQueue.poll();

			if(v == priority) {

				answer++;
				if(!stack.isEmpty()) priority = stack.pop();
				else break;

				if(o == location) break;
			} else{
				orderQueue.offer(o);
				valueQueue.offer(v);
			}
		}

		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,6,3,1,2,5,6,7,2,3}, 3));
		System.out.println(solution(new int[] {2,1,3,2}, 2));
		System.out.println(solution(new int[] {1,1,9,1,1,1}, 0));
	}
}
