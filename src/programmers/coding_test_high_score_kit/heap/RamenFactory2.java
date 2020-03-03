package programmers.coding_test_high_score_kit.heap;

import java.util.LinkedList;
import java.util.Queue;

public class RamenFactory2 {

	public static int solution(int stock, int[] dates, int[] supplies, int k) {
		int answer = 0;
		
		Queue<Integer> dq = new LinkedList();
		Queue<Integer> sq = new LinkedList();
		
		for(int i=0; i<dates.length; i++) {
			dq.add(dates[i]);
			sq.add(supplies[i]);
		}

		while(k > stock) {
	
			int max_supplies = 0;
			int today = 0;
			
			//현 재고가 버틸 수 있는 날짜 전부 구해서 그 날짜중에 최고에 해당하는 값을 구함 
			while(true)
			{
				if(dq.isEmpty() || sq.isEmpty()) break;
				
				//가능한 날짜를 넘어버림
				if(stock < dq.peek()) break;
				
				today = dq.poll();
				int tmp = sq.poll();
				
				//가능한 날짜중 공급량 최대를 구함
				if(max_supplies < tmp) {
					max_supplies = tmp;
				}
			}
			
			stock += max_supplies;
			//stock -= today - ? ;
			
			answer++;
			
		}
		
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
