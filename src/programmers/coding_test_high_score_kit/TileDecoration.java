package programmers.coding_test_high_score_kit;

public class TileDecoration {

	public static long solution(int N) {
        long answer = 0;

        long[] arr = new long[N];
        
        for(int i=0; i<N; i++) {
        	if(i <= 1) arr[i] = 1;
        	else arr[i] = arr[i-1] + arr[i-2];
        }

        answer = (arr[N-1] + arr[N-2]*2 + arr[N-3]) * 2;
        
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		
		long a = solution(5);
		long b = solution(6);
		
	}
}
