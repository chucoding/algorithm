package programmers.coding_test_high_score_kit.heap;

import java.util.PriorityQueue;

public class RamenFactory2 {

	public static int solution(int stock, int[] dates, int[] supplies, int k) {
		
		long a = System.nanoTime();
		
        int answer = 0;
        int index = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        for(int i=1; i<k; i++) {
        	
        	if(index < supplies.length && i == dates[index] ) {
        		heap.offer(supplies[index++]);
        	}
        	
        	if(stock == 0 && !heap.isEmpty()) {
        		stock += heap.poll();
        		answer++;
        	}
        	
        	stock--;
        }
        
        long b = System.nanoTime();
        System.out.println(b-a);
        
        return answer;
    }

	public static void main(String[] args) {
		
		int stock = 4; // 남아 있는 밀가루 개수
		int[] dates = {4, 10, 15}; // 밀가루 공급 일정
		int[] supplies = {20, 5, 10}; //밀가루 수량
		int k = 30; // 공장 재가동까지 남은 일
		int result = 0; // 최소 몇번 운송??
		
		result = solution(stock, dates, supplies, k);
		System.out.println(result);
	}
}
