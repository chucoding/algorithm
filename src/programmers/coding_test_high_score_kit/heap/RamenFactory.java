package programmers.coding_test_high_score_kit.heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RamenFactory {

	public static int solution(int stock, int[] dates, int[] supplies, int k) {
		int answer = 0;
		
		Queue<Integer> queue = new LinkedList();
		List list = new ArrayList();
		
		for(int i=0; i<dates.length; i++) {
			queue.add(dates[i]);
			list.add(supplies[i]);
		}
		
		Arrays.sort(supplies);
		
		int dateIndex = 0;
		
		//하루에 한번 돌아야됨 - 재고가 계속 줄기때문
		for(int i=0; i<k; i++) {
			
			if(i == dates[dateIndex]) {
				for(int j=supplies.length-1; j>=0; j--) {
					if(queue.peek() < supplies[j]) {
						int date = dates[list.indexOf(supplies[j])];
						
					}
				}
				dateIndex++;
			}
			
			//하루당 밀가루 사용
			stock--;
			
			//재고 채워넣기
			if(stock == 0) {
				
				//계산해야됨 계산해서 최소값을 더해야됨
				//stock += queue.poll();
				answer++;
			}
			
			if(queue.isEmpty()) break;
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
