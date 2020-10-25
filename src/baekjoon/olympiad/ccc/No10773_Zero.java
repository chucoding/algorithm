package baekjoon.olympiad.ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class No10773_Zero {

	private static Deque<Integer> stack = new ArrayDeque<Integer>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int num = -1;
		for (int i = 0; i < n; i++) {
			num = Integer.parseInt(br.readLine());
			if (num == 0)
				stack.pop();
			else
				stack.push(num);
		}
		br.close();
		
		int sum = 0;
		while(true) {
			if (stack.isEmpty()) {
				break;
			}
			sum += stack.pop();
		}
		
		System.out.println(sum);
	}
}
