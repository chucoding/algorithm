package programmers.coding_test_high_score_kit.stack_queue.printer;

public class Printer3 {

	public static int solution(int[] priorities, int location) {
		int answer = 0;

		long a = System.nanoTime();
		
		int max = 0;
		int len = priorities.length;

		while (true) {
			answer++;
			max = 0;
			int maxIndex = 0;
			
			for (int i = 0; i < len; i++) {
				if (max < priorities[i]) {
					max = priorities[i];
					maxIndex = i;
				}
			}

			// 처음값이 최대값이 아니라면 회전하기 - location 값 변경
			if (maxIndex != 0) {
				int[] tempArr = new int[maxIndex];

				for (int i = 0; i < maxIndex; i++) {
					tempArr[i] = priorities[i];
				}

				int j;
				for (j = 0; j+maxIndex < len; j++) {
					priorities[j] = priorities[j+maxIndex];
				}

				for (int i = 0; i < maxIndex; i++) {
					priorities[j++] = tempArr[i];
				}

				location -= maxIndex;

				if (location < 0) {
					location += len;
				}
			}

			// pop!!
			if (location == 0)
				break;

			for (int i = 1; i < len; i++) {
				priorities[i - 1] = priorities[i];
			}

			location--;
			len--;
		}
		
		long b = System.nanoTime();
        System.out.println(b-a);

		return answer;
	
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,6,3,1,2,5,6,7,2,3}, 3));
//		System.out.println(solution(new int[] {2,1,3,2}, 2));
//		System.out.println(solution(new int[] {1,1,9,1,1,1}, 0));
	}
}
