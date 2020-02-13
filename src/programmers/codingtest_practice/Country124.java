package programmers.codingtest_practice;

import java.util.Stack;

public class Country124 {

	private static int[] arr = {1,2,4};
	
	public static String solution(int n) {
		String answer = "";
		
		int length = (int) Math.ceil((n-1)/3)+1;
		dfs(answer, 0, n, length);
		return answer;
	}
	
	public static String dfs(String answer, int i, int n, int length) {
		
		if(length == 0) return answer;
		
		Stack st = new Stack();
		
		char temp = Character.forDigit(arr[(n-1)%3], 10);
		answer += temp;
		System.out.print(temp);
		return dfs(answer, i, n, --length);
		
	}

	public static void main(String[] args) {
		System.out.println(solution(1));
		System.out.println(solution(2));
		System.out.println(solution(3));
		System.out.println(solution(4));
		System.out.println(solution(5));
	}
}
