package programmers.codingtest_practice.numberOf124Countries;

public class NumberOf124Countries1 {

	public static String solution(int n) {
	    String answer = "";
	    
	    StringBuilder sb = new StringBuilder();
	    char[] num = {52,49,50}; //4,1,2
	    
	    while(n > 0){
	        sb.insert(0,num[n%3]);
	        n = (n - 1) / 3;
	    }
	    
	    answer = String.valueOf(sb);
	    return answer;
	}
	
	public static void main(String[] args) {
		solution(2);
	}
}
