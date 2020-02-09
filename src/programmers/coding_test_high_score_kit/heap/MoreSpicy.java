package programmers.coding_test_high_score_kit.heap;

import java.util.PriorityQueue;

public class MoreSpicy {

	public static int solution(int[] scoville, int K) {
		
		int answer = 0;
		PriorityQueue<Integer> heap = new PriorityQueue();
		
		for(int sco : scoville) {
			heap.offer(sco);
		}
		
		while(heap.peek() <= K) {
			
			if(heap.size() == 1) {
				return -1;
			}
			
			int a = heap.poll(); 
			int b = heap.poll();
			
			int result = a + ( b*2 );
			
			heap.offer(result);
			answer++;
		}
		
	    return answer;
	}
	
	public static void main(String[] args) {
		
		int[] scoville = {1,2,3,9,10,12};
		int k = 7;
		
		int min = solution(scoville, k);
		System.out.println(min);
	}
}
