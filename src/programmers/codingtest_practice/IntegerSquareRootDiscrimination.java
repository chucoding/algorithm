package programmers.codingtest_practice;

public class IntegerSquareRootDiscrimination {

	public static long solution(long n) {
		
		int a = (int)Math.sqrt(n);
		if(a * a == n) return (a+1) * (a+1);
		return -1;
	}
	
	public static void main(String[] args) {
		solution(121);
		System.out.println(solution(121));
		System.out.println(solution(3));
	}
}
