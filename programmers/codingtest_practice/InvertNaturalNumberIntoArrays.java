package programmers.codingtest_practice;

public class InvertNaturalNumberIntoArrays {

	public static int[] solution(long n) {
		int[] answer = {};
		int len = (int) Math.ceil(Math.log10(n));
		
		answer = new int[len];
		for(int i=0; i<len; i++) {
			answer[i] = (int) (n % 10);
			n /= 10;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		solution(12345);
	}
}
