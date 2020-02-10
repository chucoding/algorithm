package programmers.coding_test_high_score_kit.greedy;

import java.util.Stack;

public class CreateLargeNumber {

    public static String solution(String number, int k) {

    	String answer = "";
    	StringBuffer sb = new StringBuffer(number);

    	int t=1;
    	for(int i=0; i<10; i++) {

    		if(k == 0) break;
    		int j=0;
    		while(j<sb.length()-1) {
    			if(k == 0) break; 
    			if(i == sb.charAt(j)-48) {
//    				System.out.println(sb);
    				sb.deleteCharAt(j);
    				k--;
    				t++;
    				j=0;
    			} else j++;
    		}
        }

    	System.out.println(sb);
    	answer = sb.toString();
    	return answer;
	}
    
    public static String solution2(String number, int k) {
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

		solution("1924", 2);
		solution("1231234", 4);
		solution("4177252841",5);
		solution("410002841",4);
		solution("000002841",4);
		solution("7032841",5);
		solution("0000000",6);
	System.out.println();
		solution2("19241", 3);
		solution2("1231234", 4);
		solution2("4177252841",5);
		solution2("410002841",4);
		solution2("000002841",4);
		solution2("7032841",5);
		solution2("0000000",6);
	}
}

