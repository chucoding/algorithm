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
		int dump = 0;
		boolean b = true;

		for(int i=0; i<position.length; i++) {

			int qsize = queue.size();
			int pos = position[i] - 1;
			if(b) pos += dump;
			else pos -= dump;
			dump = 0;
			int item = -1;

			while (true) {

				if (queue.isEmpty()) break;

				if (qsize - pos > pos - 1) {
					item = queue.pollFirst();
					if (position[i] != item) {
						b = false;
						queue.addLast(item);
						count++;
						dump++;
					} else break;
				} else if(qsize - pos < pos - 1) {
					item = queue.pollLast();
					count++;
					b = true;
					dump++;
					if (position[i] != item) {
						queue.addFirst(item);
					} else break;
				} else if(((qsize - pos) == (pos - 1)) && i<position.length-1 ) {
					int pos2 = position[i+1];
					if(qsize - pos2 > pos2 - 1) {
						item = queue.pollFirst();
						if (position[i] != item) {
							queue.addLast(item);
							count++;
							dump++;
							b = false;
						} else break;
					} else {
						item = queue.pollLast();
						count++;
						dump++;
						b=true;
						if (position[i] != item) {
							queue.addFirst(item);
						} else break;
					}
				}
			}
			System.out.println(count);
			System.out.println(queue);
		}
		
		System.out.println(count);
	}
}
