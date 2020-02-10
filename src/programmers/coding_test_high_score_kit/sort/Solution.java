package programmers.coding_test_high_score_kit.sort;

import java.util.Arrays;

public class Solution {

	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++) {
        	
        	int[] dump = new int[commands[i][1] - commands[i][0] + 1];
        	for(int j=0; j<dump.length; j++) {
        		dump[j] = array[j+commands[i][0]-1];
            }
        	
        	Arrays.sort(dump);
        	answer[i] = dump[commands[i][2]-1];
        }

        return answer;
    }
	
	public static int[] solution2(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for(int i=0; i<commands.length; i++){
			int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]); //첫번쨰 인자:배열 두번째 인자:시작인덱스 세번째 인자 : 마지막 전 인덱스!
			Arrays.sort(temp);
			answer[i] = temp[commands[i][2]-1];
		}

		return answer;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1, 5, 2, 6, 3, 7, 4};
		int[][] cmd = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int[] sol = solution(arr, cmd);
	}
}
