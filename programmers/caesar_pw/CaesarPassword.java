package programmers.codingtest_practice;

public class CaesarPassword {

	public static String solution(String s, int n) {
		String answer = "";

		char[] str = s.toCharArray();
		char[] str2 = s.toCharArray();
		for(int i=0; i<str.length; i++){    
			if(str[i] >= 65 && str[i] <=90) {
				if(str[i] + n > 90) str2[i] = (char)((str[i] + n) % 90 + 65);
				else str2[i] = (char)((str[i] + n ));
			}
			else if(str[i] >= 97 && str[i] <=122){
				if(str[i] + n > 122) str2[i] = (char)((str[i] + n) % 122 + 96);
				else str2[i] = (char)((str[i] + n ) % 122);
			} else str2[i] = str[i];
		}

		answer = new String(str2);
		return answer;
	}
	
	public static void main(String[] args) {
		solution("AB",1);
		solution("z",1);
	}
}
