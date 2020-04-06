package test.line;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution3 {

	public static int solution(String road, int n) {
		int answer = -1;
		
		Deque<Integer> stack = new ArrayDeque<Integer>();
		char[] str = road.toCharArray();
		stack.push(1);
		
		for(int i=1; i<str.length; i++) {
			if(str[i] == str[i-1]) stack.push(stack.pop()+1);
			else stack.push(1);
		}
		
		while(!stack.isEmpty()) {
			if(str[0] == '0') {
				int x = stack.pop();
			}
		}
	
		System.out.println(stack);
		
		return answer;
	}
	
	public static void main(String[] args) {
		int a = solution("111011110011111011111100011111",3);
		int b = solution("001100",5);
	}
}
