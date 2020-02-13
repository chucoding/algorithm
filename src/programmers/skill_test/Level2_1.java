package programmers.skill_test;

public class Level2_1 {

	public static long solution(int w,int h) {
		long answer = 1;
		
		int max = 0;
		int small = 0;
		int dap = 0;
		
		if(w > h) {
			max = w;
			small = h;
		}
		else {
			max = h;
			small = w;
		}
		
		while(true) {
			if(max % small == 0) {
				dap = max/small;
				break;
			}
			
			int tmp = max;
			tmp = max % small;
			
			max = small;
			small = tmp;
			
			System.out.println(max);
			System.out.println(small);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		long a = solution(8, 12);
		System.out.println(a);
	}
}
