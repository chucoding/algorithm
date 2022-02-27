package programmers.kakao2018;

public class DartGame {

	public static int solution(String dartResult) {
		int answer = 0;
		
		char[] str = dartResult.toCharArray();
		int[] score = new int[3];
		
		StringBuilder sb = new StringBuilder();
		
		int index=0;
		for(int i=0; i<str.length; i++) {
			
			if(str[i] >= 48 && str[i] <= 57) sb.append(str[i] - 48);
			else {
				if(sb.length()!=0) {
					score[index++] = Integer.parseInt(new String(sb));
					sb.setLength(0);
				}
				
				if(str[i] == 'D') score[index-1] = (int) Math.pow(score[index - 1], 2);
				if(str[i] == 'T') score[index-1] = (int) Math.pow(score[index - 1], 3);
				if(str[i] == '*') {
					score[index-1] *=2;
					if(index >= 2) score[index-2] *= 2;
				} else if(str[i] == '#') {
					score[index-1] *= -1;
				}
			}
		}
		
		for(int i=0; i<score.length; i++) {
			answer+=score[i];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		solution("1S2D*3T");
		solution("1D2S#10S");
	}
}
