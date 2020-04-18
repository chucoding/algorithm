package programmers.coding_test_high_score_kit.stack_queue;

public class StockPrice2 {

	public static int[] solution(int[] prices) {

		int[] answer = new int[prices.length];
        
        for(int i=0; i<prices.length-1; i++) {
            for(int j=i+1; j<prices.length; j++) {
                if(prices[i] > prices[j]) {
                	answer[i] = j-i;
                	break;
                }
                
                if(j==answer.length-1) answer[i] = j-i;
            }
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
