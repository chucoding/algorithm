package programmers.codingtest_practice.adding_digit;

public class AddingDigits2 {

	public static int solution(int n) {
		int answer = 0;
		
		long a = System.nanoTime();
		
		while(n!=0) {
			answer += n%10;
			n/=10;
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
