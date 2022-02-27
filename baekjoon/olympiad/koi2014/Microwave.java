package baekjoon.olympiad.koi2014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Microwave {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		br.close();

		if(input % 10 != 0) System.out.println(-1);
		else {
			
			int[] arr = new int[3];
			
			while(input > 0) {
				if(input >= 300) {
					input -= 300;
					arr[0]++;
				} else if(input >= 60) {
					input -= 60;
					arr[1]++;
				} else {
					input -= 10;
					arr[2]++;
				}
			}
			
			System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
		}
	}
}
