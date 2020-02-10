package programmers.coding_test_high_score_kit.greedy;

public class CreateLargeNumber {

    public static String solution(String number, int k) {

    	String answer = "";
    	StringBuffer sb = new StringBuffer(number);

    	int t=1;
    	for(int i=1; i<10; i++) {

    		if(k == 0) break;
    		int j=0;
    		while(j<sb.length()-1) {
    			if(k == 0) break; 
    			if(i == sb.charAt(j)-48) {
    				System.out.println(sb);
    				sb.deleteCharAt(j);
    				k--;
    				t++;
    				continue;
    			}
    			j++;
    		}
    		
        }

    	System.out.println(sb);
    	answer = sb.toString();
    	return answer;
	}
    
	public static void main(String[] args) {

		solution("1924", 2);
		solution("1231234", 3);
		solution("4177252841",4);
	}
}

