package programmers.coding_test_high_score_kit.stack_queue;

public class StockPrice2 {

	public static int[] solution(int[] prices) {

		int[] answer = new int[prices.length];
        int count = 0;
        
        for(int i=0; i<prices.length-1; i++) {
            count = 0;
            for(int j=i+1; j<prices.length; j++) {
                if(prices[i]<=prices[j]) {
                    count++;
                } else {
                    count++;
                    break;
                }
            }
            answer[i] = count;
        }
        
        answer[prices.length-1] = 0;
        
        return answer;
    }

	public static void main(String[] args) {
//		solution(new int[] {1,2,3,2,3});
//		solution(new int[] {1,2,9,2,3,4,5,4,1,3,3});
//		solution(new int[] {1,2,3,4,3,2,3});
		solution(new int[] {1,2,3,2,3,2,1,0});
	}
}
