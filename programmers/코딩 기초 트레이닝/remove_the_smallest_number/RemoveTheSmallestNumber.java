package programmers.codingtest_practice;

public class RemoveTheSmallestNumber {

	public static int[] solution(int[] arr) {

		int[] answer = {};
		
		if(arr.length == 1) answer = new int[] {-1};
		else answer = new int[arr.length-1];
		
		int min = 999999;
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) min = arr[i];
		}
		
		int j = 0;
		for(int i=0; i<arr.length; i++) {
			if(min == arr[i]) continue;
			answer[j++] = arr[i];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] arr = solution(new int[] {4,3,2,1});
	}
}
