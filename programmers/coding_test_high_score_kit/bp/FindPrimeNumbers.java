package programmers.coding_test_high_score_kit.bp;

import java.util.HashSet;
import java.util.Set;

public class FindPrimeNumbers {

	public static void permutation(int[] arr, int start, int end, Set set) {

		if(start == end) {
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<start; i++) {
				sb.append(arr[i]);
			}
			
			int n = Integer.parseInt(new String(sb));
			boolean b = true;
			
			if(n <= 2) return;
			for(int i=2; i*i <= n; i++) {
				if(n % i == 0) {
					b = false;
					break;
				}
			}
			
			if(b) set.add(n);
			return;
		}
		
		for(int i=start; i<arr.length; i++) {
			swap(arr, start, i);
			permutation(arr, start+1, end, set);
			swap(arr, start, i);
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	public static int solution(String numbers) {
		int answer = 0;
		int[] arr = new int[numbers.length()];

		for(int i=0; i<numbers.length(); i++) {
			arr[i] = Character.getNumericValue(numbers.charAt(i));
		}
		
		Set set = new HashSet();
		for(int i=1; i<=arr.length; i++) {
			permutation(arr, 0, i, set);
		}
		
		System.out.println(set.size());
		return answer;
	}
    
    public static void main(String[] args) {
		
    	int a = solution("17");
    	int b = solution("011");
    	
    }
}
