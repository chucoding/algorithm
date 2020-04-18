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
        	
        	if(!stack.isEmpty() && stack.peek().getStock() > prices[i]) {
        		Stock stock = stack.pop();
        		answer[stock.getIndex()] = i - stock.getIndex();
        	}
        	
        	Stock stock = new Stock();
        	stock.setIndex(i);        	
        	stock.setStock(prices[i]);
 
        	stack.push(stock);
        }
        
        int i = prices.length-1;
        while(!stack.isEmpty() && i>=0) {
        	
        	if(answer[i] == 0) {
        		Stock stock = stack.pop();
        		answer[i] = prices.length-1 - stock.getIndex();
        	}
        	i--;
        }
        
        return answer;
    }

	public static void main(String[] args) {
//		solution(new int[] {1,2,3,2,3});
		solution(new int[] {1,2,9,2,3,4,5,4,1,3,3});
	}
}
