package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No9655_StoneGame {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		boolean b = true;
		while(true) {
			if(b) {
				if(n == 1) {
					System.out.println("SK");
					break;
				}
				
				if(n>3) n-=3;
				else n-=1;
				
				b = false;
			} else {
				if(n == 1) {
					System.out.println("CY");
					break;
				}
				
				if(n>3) n-=3;
				else n-=1;
				
				b = true;
			}
		}
		
		br.close();
	}
}
