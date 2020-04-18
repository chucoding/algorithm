package programmers.coding_test_high_score_kit.stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;

class Stock {
	
	private int index;
	private int stock;
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}

public class StockPrice {

	public static int[] solution(int[] prices) {

		int[] answer = new int[prices.length];
		Deque<Stock> stack = new ArrayDeque<Stock>();
		
        for(int i=0; i<prices.length; i++) {
        	
        	while(!stack.isEmpty() && stack.peek().getStock() > prices[i]) {
        		Stock stock = stack.pop();
        		answer[stock.getIndex()] = i - stock.getIndex();
        	}
        	
        	Stock stock = new Stock();
        	stock.setIndex(i);        	
        	stock.setStock(prices[i]);
 
        	stack.push(stock);
        }
        
        while(!stack.isEmpty()) {
        	Stock stock = stack.pop();
        	answer[stock.getIndex()] = prices.length-1 - stock.getIndex() -1;
        }
        
//        int i = prices.length-1;
//        while(!stack.isEmpty() && i>=0) {
//        	
//        	if(answer[i] == 0) {
//        		Stock stock = stack.pop();
//        		answer[i] = prices.length-1 - stock.getIndex();
//        	}
//        	i--;
//        }
        
        for(int j=0; j<answer.length; j++) {
        	System.out.println(answer[j]);
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
