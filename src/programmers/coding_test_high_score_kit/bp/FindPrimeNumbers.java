package programmers.coding_test_high_score_kit.bp;

import java.util.HashSet;
import java.util.Set;

public class FindPrimeNumbers {

	public static void perm(int[] arr, int depth, int k, Set set) {
		if(depth == k) {
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<k; i++) {
				sb.append(arr[i]);
			}
			int n = Integer.parseInt(String.valueOf(sb));
			boolean b = true;
			if(n <= 1) return;
			for(int j=2; j<=Math.sqrt(n); j++) {
				if(n % j == 0) {
					b = false;
					break;
				}
			}
			if(b) set.add(n);
			return;
		}
		else {
			for(int i=depth; i<arr.length; i++) {
				swap(arr, depth, i);
				perm(arr, depth+1, k, set);
				swap(arr, depth, i);
			}
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int solution(String numbers) {
		int answer = 0;
		
		char[] list = numbers.toCharArray();
		int[] arr = new int[numbers.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(String.valueOf(list[i]));
		}
		
		Set set = new HashSet();

		for(int i=1; i<=numbers.length(); i++) {
			perm(arr, 0, i, set);
		}

		answer = set.size();
		System.out.println(answer);
		return answer;
	}
    
    public static void main(String[] args) {
		
    	int a = solution("17");
    	int b = solution("011");
    }
}
