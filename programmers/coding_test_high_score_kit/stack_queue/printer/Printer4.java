package programmers.coding_test_high_score_kit.stack_queue.printer;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

class Printers {
	
	private int index;
	private int value;

	public Printers(int index, int value) {
		this.index = index;
		this.value = value;
	}

	public int getIndex() {
		return index;
	}

	public int getValue() {
		return value;
	}

}

public class Printer4 {
	
	public static int solution(int[] priorities, int location) {
		
		int answer = 0;
		
		long a = System.nanoTime();
		
		Queue<Printers> q = new ArrayDeque<Printers>();
		for(int i=0; i<priorities.length; i++) {
			q.offer(new Printers(i,priorities[i]));
		}
		
		Arrays.sort(priorities);
		
		while(!q.isEmpty()) {
			if(q.peek().getValue() == priorities[priorities.length-1-answer]) {
				answer++;
				if(q.peek().getIndex() == location) break;
				q.poll();
			} else q.offer(q.poll());
		}
		
		long b = System.nanoTime();
        System.out.println(b-a);
		
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,6,3,1,2,5,6,7,2,3}, 3));
//		System.out.println(solution(new int[] {2,1,3,2}, 2));
//		System.out.println(solution(new int[] {1,1,9,1,1,1}, 0));
	}
}
