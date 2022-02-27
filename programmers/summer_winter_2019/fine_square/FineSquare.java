package programmers.summer_winter_2019.fine_square;

public class FineSquare {

	public static long solution(int w,int h) {
		long answer = 1;
		
		int min = w;
		int max = 0;
		
        if(w > h) {
        	min = h;
        	max = w;
        } else {
        	min = w;
        	max = h;
        }
        
        int n = min;
        int o1 = 0;
        while(n > 0) {
        	if(w % n == 0 && h % n ==0) {
        		o1 = n;
        		break;
        	}
        	n--;
        }
        
        answer = w*h - o1*(w/o1 + h/o1 -1);
        
		return answer;
	}
	
	public static void main(String[] args) {
		solution(8, 12);
	}
}
