package programmers.codingtest_practice;

public class CollatzGuess {

	public static int solution(int num) {
		int answer = 0;
		
		while(true) {
			
			if(answer == 500) return -1;
			else if(num == 1) break;
			else if(num % 2 == 0) num/=2;
			else if(num % 2 == 1) num = num * 3 +1;
			
			answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		solution(626331);
	}
}
