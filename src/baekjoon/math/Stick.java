package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stick {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int count = 0;
		int stick = 64;
		
		while (true) {
			
			if(x == 64) {
				count = 1;
				break;
			}
			if(sum == x) break;
			stick /= 2;
			sum+= stick;
			if(sum > x) {
				sum -= stick;
				continue;
			}
			count++;
		}
		
		System.out.println(count);
	}
}
