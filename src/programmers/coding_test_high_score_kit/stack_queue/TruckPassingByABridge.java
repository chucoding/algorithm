package programmers.coding_test_high_score_kit.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class TruckPassingByABridge {

	public static int solution(int bridge_length, int weight, int[] truck_weights) {

		int answer = 0;
		int[] endTime = new int[truck_weights.length];
		Queue<Integer> onBridge = new LinkedList<>(); //다리
		
		int cur = 0; //트럭순서
		
		while(true) {
			// 도착한 버스 제거
			if(!onBridge.isEmpty() && endTime[onBridge.peek()] == answer) {
				weight += truck_weights[onBridge.poll()];
			}
			
			// 대기하는 버스 추가
			if(cur < truck_weights.length && truck_weights[cur] <= weight) {
				onBridge.add(cur);
				endTime[cur] = answer + bridge_length; //다리길이 1당 1초
				weight -= truck_weights[cur];
				cur++;
			}
			
			answer++;
			if(onBridge.isEmpty()) break;
		}
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		int[] truck_weights = {7,4,5,6};
		int second = solution(2, 10, truck_weights);
	}
	
}
