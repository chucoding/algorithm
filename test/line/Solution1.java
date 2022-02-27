package test.line;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution1 {

	public static int solution(String inputString) {
		int answer = 0;
		
		char[] arr = inputString.toCharArray();
		Deque<Character> stack = new ArrayDeque<Character>(); 
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == '(' ||arr[i] == '{'|| arr[i] == '[' ||arr[i] == '<') stack.push(arr[i]);
			else if(arr[i] == ')'|| arr[i] == '}'|| arr[i] == ']' || arr[i] == '>') {
				if(!stack.isEmpty()) {
					if(arr[i] == ')' && stack.peek() == '(') {
						stack.pop();
						answer++;
					}
					else if(arr[i] == '}' && stack.peek() == '{') {
						stack.pop();
						answer++;
					}
					else if(arr[i] == ']' && stack.peek() == '[') {
						stack.pop();
						answer++;
					}
					else if(arr[i] == '>' && stack.peek() == '<') {
						stack.pop();
						answer++;
					}
				}
			}
		}

		if(!stack.isEmpty() && answer==0) answer = -1;
		return answer;
	}
	
	public static void main(String[] args) {
		int a = solution("Hello, world!");
		int b = solution("if (Count of eggs is 4.) {Buy milk.}");
	}
}
