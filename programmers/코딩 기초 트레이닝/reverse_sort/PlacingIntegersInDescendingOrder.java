package programmers.codingtest_practice;

import java.util.Arrays;
import java.util.Collections;

public class PlacingIntegersInDescendingOrder {

	public static long solution(long n) {
		long answer = 0;

		Integer[] arr = new Integer[(int) Math.ceil(Math.log10(n))];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(n % 10);
			n/=10;
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]);
		}
		
		answer = Long.parseLong(new String(sb));
		return answer;
	}
	
	public static void main(String[] args) {
		solution(118372);
	}
}
