package baekjoon.data_structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.StringTokenizer;

public class RotatingQueue2 {

	private static StringTokenizer st;
	private static Deque<Integer> queue;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		st = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		queue = new ArrayDeque<Integer>();
		
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

			int index = peek(position[i]);
			int qsize = queue.size();
			
			if(index <= qsize-index) {
				for(int j=0; j<index; j++) {
					queue.addLast(queue.removeFirst());
					count++;
				}
			} else {
				for(int j=0; j<qsize-index; j++) {
					queue.addFirst(queue.removeLast());
					count++;
				}
			}
			queue.remove();
			System.out.println(queue);
		}
		System.out.println(count);
	}
	
	public static int peek(int item) {
		int index = -1;
		Iterator<Integer> itr = queue.iterator();
		while(itr.hasNext()) {
  			index++;
			if(itr.next() == item) 
				return index;
		}
		return index;
	}
}
