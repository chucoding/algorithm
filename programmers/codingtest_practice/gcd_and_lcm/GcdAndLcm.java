package programmers.codingtest_practice;

public class GcdAndLcm {

	public static int[] solution(int n, int m) {
		int[] answer = {};
		answer = new int[2];
		
		int min = 0;
		if(n > m) min = m;
		else min = n;
		
		for(int i=min; i>=1; i--) {
			if(n % i == 0 && m % i == 0) {
				answer[0] = i;
				break;
			}
		}
		
		answer[1] = n * m / answer[0];
		
		return answer;
	}
	
	public static void main(String[] args) {
		solution(3, 12);
	}
}
