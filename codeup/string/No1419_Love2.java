package codeup.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1419_Love2 {

	public static void main(String[] args) {
		
		long a = System.nanoTime();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = br.readLine();

			int lineCnt = 0;
			int fromIndex = -1;
			while((fromIndex = s.indexOf("love", fromIndex+1)) >=0) {
				lineCnt++;
			}
			
			System.out.println(lineCnt);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		long b = System.nanoTime();
		System.out.println(b-a);
		
	}
}
