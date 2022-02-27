package programmers.codingtest_practice.numberOf124Countries;

public class NumberOf124Countries2 {

	public static int baseLog(double x, double base) {
		return (int) Math.floor( Math.log(x) / Math.log(base) );
	}
	
	//나중에 시간나면 해볼것
	public static String solution(int n) {
		
		String answer = "";
		StringBuilder sb = new StringBuilder();
		char[] num = {52,49,50}; //4,1,2
		
		int digit = baseLog(n,3);
		for(int i=0; i<digit; i++) {
			
			
			
			sb.append(num);
		}

		return answer;
	}

	public static void main(String[] args) {
		solution(2);
	}
}
