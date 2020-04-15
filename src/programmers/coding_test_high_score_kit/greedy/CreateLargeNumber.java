package programmers.coding_test_high_score_kit.greedy;

import java.util.Stack;

public class CreateLargeNumber {

    public static String solution(String number, int k) {
        char[] result = new char[number.length() - k];
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<number.length(); i++) {
            char c = number.charAt(i);
            while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
                stack.pop();
            }
            stack.push(c);
        }
        for (int i=0; i<result.length; i++) {
            result[i] = stack.get(i);
        }
        
        System.out.println(new String(result));
        return new String(result);
    }
    
	public static void main(String[] args) {

		solution("19241", 3);
		solution("1231234", 4);
		solution("4177252841",5);
		solution("410002841",4);
		solution("000002841",4);
		solution("7032841",5);
		solution("0000000",6);
	}
}

