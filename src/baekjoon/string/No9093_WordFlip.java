package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No9093_WordFlip {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringBuilder[] sbArr = new StringBuilder[n];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			sbArr[i] = new StringBuilder();
			while(st.hasMoreTokens()) {
				char[] charArr = st.nextToken().toCharArray();
				for(int j=charArr.length-1; j>=0; j--) {
					sbArr[i].append(charArr[j]);
				}
				sbArr[i].append(" ");
			}
			System.out.println(sbArr[i].deleteCharAt(sbArr[i].length()-1));
		}
	}
}
