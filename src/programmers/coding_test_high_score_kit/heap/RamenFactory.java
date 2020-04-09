package programmers.coding_test_high_score_kit.heap;

public class RamenFactory {

	public static int solution(int stock, int[] dates, int[] supplies, int k) {
		
		long a = System.nanoTime();
		
		int answer = 0;
		int index = 0;
		int last_index = 0;
		
		while(stock < k-1) {
			
			int max = 0;
			
			while(true) {
				if(last_index > dates.length-1) {
					last_index = dates.length-1;
					break;
				} else if((dates[last_index] + stock > k)) break;
				
				last_index++;
			}
			
			while(index < last_index) {
				if(stock - dates[index] < 0) break;
				if(max < supplies[index]) max = supplies[index++];
			}
			
			stock += max;
			answer++;
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
