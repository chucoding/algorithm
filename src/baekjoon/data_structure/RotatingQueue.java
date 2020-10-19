package baekjoon.data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class RotatingQueue {

	private static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		st = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		Deque<Integer> queue = new ArrayDeque<Integer>();
		
		for(int i=0; i<size; i++) {
			queue.offer(i+1);
		}
		
		st = new StringTokenizer(br.readLine());
		int[] position = new int[n];
		for(int i=0; i<n; i++) {
			position[i] = Integer.parseInt(st.nextToken());
		}
		
		int count = 0;
		for(int i=0; i<position.length; i++) {

			int item = -1;
			int dump = 0;
			
			while (true) {
				if (queue.isEmpty()) break;

				item = queue.poll();
				if(item == position[i]) {
					if(dump > queue.size()-dump) count += queue.size()-dump+1;
					else count += dump;
					break;
				}
				
				queue.offer(item);
				dump++; //이동한 거리
			}
				
			System.out.println(queue);
		}
		
		System.out.println(count);
	}
}
