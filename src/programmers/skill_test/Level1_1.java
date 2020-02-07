package programmers.skill_test;

import java.util.ArrayList;
import java.util.List;

public class Level1_1 {

	public static int[] solution(int []arr) {
        
		int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
            if(i==0) {
                list.add(arr[i]);
            } else {
                if(arr[i-1] == arr[i]) continue;
                list.add(arr[i]);
            }
        }

        answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }

        return answer;
	}
	
	//출력 테스트용
	public static void main(String[] args) {
		
		int arr1[] = {1, 1, 3, 3, 0, 1, 1};
		int arr2[] = {4, 4, 4, 3, 3};
		
		arr1 = solution(arr1);
		arr2 = solution(arr2);

	}
}