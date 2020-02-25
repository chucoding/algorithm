package programmers.coding_test_high_score_kit.heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class RamenFactory2 {

	public static int solution(int stock, int[] dates, int[] supplies, int k) {
		int answer = 0;
		
		Map map = new HashMap();
		Queue q = new LinkedList();
		
		for(int i=0; i<dates.length; i++) {
			map.put(dates[i],supplies[i]);
			q.add(map);
		}
		
		int i=0;
		while(k > stock + supplies[i]) {

			if(stock >= dates[i])
			{
				List list = new ArrayList();
				list.add(supplies[i]);
			}
			
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
