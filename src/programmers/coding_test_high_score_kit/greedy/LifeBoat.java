package programmers.coding_test_high_score_kit.greedy;

import java.util.Arrays;

public class LifeBoat {

	public static int solution(int[] people, int limit) {

		int answer = 0;
		int j=0;
		Arrays.sort(people);

		for(int i=people.length-1; i>j; i--) {
			if(people[i] + people[j] <= limit) {
				answer++;
				j++;
			}
		}
		
		return people.length-answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {70, 50, 80, 50}, 100));
	}
}
