package programmers.codingtest_practice;

import java.util.StringTokenizer;

public class MakeStangeString {

	public static String solution(String s) {
		String answer = "";

		StringTokenizer st = new StringTokenizer(s," ",true);
		String[] str = new String[st.countTokens()];
		StringBuilder sb = new StringBuilder();
		
		int i = 0;
		while(st.hasMoreTokens()) {
			str[i++] = st.nextToken();
		}
		
		for(i=0; i<str.length; i++) {
			
			if(str[i].startsWith(" ")) sb.append(" ");
			else {
				for(int j=0; j<str[i].length(); j++) {
					if(j % 2 == 0 || j == 0) sb.append(Character.toUpperCase(str[i].charAt(j)));
					else if(j % 2 == 1) sb.append(Character.toLowerCase(str[i].charAt(j)));
				}
			}
		}

		answer = sb.toString();
		return answer;
	}
	
	//테스트 문자열
	public static void main(String[] args) {
		solution("try hello world");
		solution("     s           d");
	}
}
