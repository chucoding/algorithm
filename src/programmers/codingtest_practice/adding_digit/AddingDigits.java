package programmers.codingtest_practice.adding_digit;

public class AddingDigits {

	public static int solution(int n) {
		int answer = 0;
		
		long a = System.nanoTime();
		
		String s = String.valueOf(n);
		for(int i=0; i<s.length(); i++) {
			answer += Character.getNumericValue(s.charAt(i));
		}
		
		long b = System.nanoTime();
        System.out.println(b-a);
		
		return answer;
	}
	
	public static void main(String[] args) {
		int sol = solution(123);
		System.out.println(sol);
	}
}
