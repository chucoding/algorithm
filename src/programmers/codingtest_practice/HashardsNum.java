package programmers.codingtest_practice;

public class HashardsNum {

	public static boolean solution(int x) {
		boolean answer = true;
		
		int sum = 0;
		int i = x;
		while(true) {
			if(i == 0) break;
			sum += i % 10;
			i/=10;
		}
	
		if(x % sum == 0) answer = true;
		else answer = false;
		
		return answer;
	}
	
	public static void main(String[] args) {
		solution(13);
	}
}
