package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		String input2 = br.readLine();

		String[] keys = input.split("\\s");
		String[] words = input2.split("\\s");
		
		int cnt = 0;
		
		//스트링 배열을 정수 배열로 변환
		int[] nums = Arrays.stream(keys).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(words);

		for(int i=0; i<words.length; i++) {
			
			if(i == 0 || words[i-1] == words[i]) continue;

			if(words.length-i < nums[1]-1 ) {
				cnt++;
				break;
			}
			
			for(int j=0; j<nums[1]-1; j++) {
				words[i] = words[i-1];
				if(j == nums[1]-2) break;
				i++;
			}
			
			cnt++;
		}
		
		System.out.println(cnt);
	}
}
