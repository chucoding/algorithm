package programmers.codingtest_practice;

public class AddingDigits {

	public static int solution(int n) {
		int answer = 0;
		
		String s = String.valueOf(n);
		for(int i=0; i<s.length(); i++) {
			answer += Character.getNumericValue(s.charAt(i));
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int sol = solution(123);
		System.out.println(sol);
	}
}
