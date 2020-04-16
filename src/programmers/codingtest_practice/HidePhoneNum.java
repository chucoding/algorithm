package programmers.codingtest_practice;

import java.util.Arrays;

public class HidePhoneNum {

	public static String solution(String phone_number) {
		String answer = "";

		char[] str = phone_number.toCharArray();
		Arrays.fill(str,'*');

		for(int i=phone_number.length()-1; i>=phone_number.length()-4; i--){
			str[i] = phone_number.charAt(i);
		}

		answer = String.valueOf(str);
		return answer;
	}
	
	public static void main(String[] args) {
		solution("01033334444");
	}
}
