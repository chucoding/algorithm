package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No11399_ATM {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] strArr = br.readLine().split(" ");
		br.close();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}

		Arrays.sort(arr);
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				sum+=arr[j];
			}
		}
		
		System.out.println(sum);
	}
	
}
