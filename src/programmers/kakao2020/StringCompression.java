package programmers.kakao2020;

public class StringCompression {

    public static int solution(String s) {
        int answer = 0;
        int i = s.length()/2;
 
        StringBuilder sb = new StringBuilder(s);
        
//        while(i>-1) {
        	if(sb.substring(0,i).startsWith(sb.substring(i,s.length()))) {
        		int a = 0;
        	}
//        }
        return answer;
    }
    
    public static void main(String[] args) {
		
    	solution("aabbaccc");
	}
}
