package programmers.coding_test_high_score_kit.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

class Disk implements Comparable<Disk> {

	//comparable이 implements되지 않은 object를 sorting 하려고 하면 컴파일러가 comparable interface가 구현되어 있을거라고 예상하기 때문에 exception이 발생한다.
	
	private Integer requestTime;
	private Integer processTime;
	
	public Disk(int requestTime, int processTime){
		this.requestTime = requestTime;
		this.processTime = processTime;
	}
	
	public int getRequestTime() {
		return requestTime;
	}

	public int getProcessTime() {
		return processTime;
	}

	@Override
	public int compareTo(Disk o) {
		if(this.processTime - this.requestTime < o.processTime - o.requestTime) return -1;
		else return 1;
	}

	@Override
	public String toString() {
		return "Disk [requestTime=" + requestTime + ", processTime=" + processTime + "]";
	}
}

public class DiskController {

	public static int solution(int[][] jobs) {
		int answer = 0;
		
		int length = 0;
		for(int i=0; i<jobs.length; i++) {
			length += jobs[i][1];
		}
		
		Arrays.sort(jobs, (o1, o2) -> {
			if(o1[0] == o2[0]) return Integer.compare(o1[1], o2[1]);
			else return Integer.compare(o1[0], o2[0]);
		});
		
		PriorityQueue<Disk> heap = new PriorityQueue<Disk>();
		
		int index = 0;
		int endTime = 0;
		Disk d;
		
		for(int i=0; i<length; i++) {
			
			while(index < jobs.length && i == jobs[index][0]) {
				heap.offer(new Disk(jobs[index][0], jobs[index][1]));
				index++;
			}
			
			if(!heap.isEmpty() && endTime == 0) {
				d = heap.poll();
				answer += i + d.getProcessTime() - d.getRequestTime();
				endTime += d.getProcessTime();
			}
			
			endTime--;
		}

		answer /= 3;
		return answer;
	}
	
	public static void main(String[] args) {
		solution(new int[][] {{0,3},{1,9},{2,6}});
	}
}
