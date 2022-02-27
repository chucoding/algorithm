package test;

public class Test2 {

	public static int solution(int a, int b, int budget) {
		int answer = 0;
		int tot = 0;
		int big_price = 0;
		int small_price = 0;
		
		if(a > b) {
			big_price = a;
			small_price = b;
		} else {
			big_price = b;
			small_price = a;
		}
		
		tot = budget/big_price + 1;
		
		for(int i=0; i<tot; i++) {
			if((budget - (big_price * i)) % small_price == 0) answer++; 
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int a = solution(3000, 5000, 23000);
		System.out.println("-------------");
		int b = solution(3000, 5000, 24000);
		System.out.println("-------------");
		int c = solution(3000, 5000, 25000);
		System.out.println("-------------");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
