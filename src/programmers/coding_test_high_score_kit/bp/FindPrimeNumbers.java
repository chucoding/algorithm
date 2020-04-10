package programmers.coding_test_high_score_kit.bp;

import java.util.HashMap;
import java.util.Map;

public class FindPrimeNumbers {

	public static int solution(String numbers) {
		int answer = 0;

		char[] str = numbers.toCharArray();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<str.length; i++) {
			map.put(str[i]-48, map.getOrDefault(map.get(str[i]-48), 0)+1);
		}

		for(Integer i : map.keySet()) {
			map.get(i);
		}
		
//		Set<Integer> set = new HashSet<Integer>();
//
//		for(int i=0; i<numbers.length(); i++) {
//			for(int j=i; j<numbers.length(); j++) {
//				set.add(Integer.valueOf(numbers.substring(i, j+1)));
//			}
//		}
//
//		System.out.println(set);

		return answer;
	}
    
    public static void main(String[] args) {
		
    	int a = solution("17");
    	int b = solution("011");
    }
}
