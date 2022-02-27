package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No6359_DrunkSangbum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		int[] arr = new int[count];
		for(int i=0; i<count; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<count; i++) {
			int[] room = new int[arr[i]];
			for(int j=0; j<room.length; j++) {
				play(room, j+1);
			}

			int exit = 0;
			for(int j=0; j<room.length; j++) {
				if(room[j] == 1) exit++;
			}
			System.out.println(exit);
		}
	}
	
	public static void play(int[] room, int round) {
		for(int i=0; i<room.length; i++) {
			if((i+1) % round == 0) {
				if(room[i] == 0) room[i] = 1;
				else room[i] = 0;
			}
		}
	}
}
