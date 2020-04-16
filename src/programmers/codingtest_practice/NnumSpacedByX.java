package programmers.codingtest_practice;

public class NnumSpacedByX {

	public static long[] solution(int x, int n) {
		long[] answer = {};
		
		answer = new long[n];
		answer[0] = x;
		for(int i=1; i<n; i++) {
			answer[i] = answer[i-1] + x;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		solution(2,5);
	}
}
