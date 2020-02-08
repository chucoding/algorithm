package programmers.skill_test;

public class Level2_3 {
	public static String solution(String s) {
		String answer = "";
		
		for(int i=0; i<s.length(); i++) {
			
			if(i == 0) {
				
				if(s.charAt(i) >= 97 && s.charAt(i) <= 122) {
					answer += (char)(s.charAt(i) - 32);
					
				} else if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {
					answer += (char)(s.charAt(i) + 32);
					
				} else answer += s.charAt(i);
				
				continue;
				
			}
			
			if(s.charAt(i-1) == 32) {
				
				if(s.charAt(i) >= 97 && s.charAt(i) <= 122) {
					answer += (char)(s.charAt(i) - 32);
					continue;
				}
				
			}
			
			if(s.charAt(i-1) != 32) {
				if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {
					answer += (char)(s.charAt(i) + 32);
					continue;
				}
			}
			
			answer += s.charAt(i);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		String s = "3people unFollowed me";
		String sol = solution(s);
		System.out.println(sol);
	}
}
