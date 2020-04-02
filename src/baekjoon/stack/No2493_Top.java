package baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

public class No2493_Top {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		int arr[] = new int[n];
		int answer[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Stack<Integer> top = new Stack<Integer>();
		
		for(int i=n-1; i>=0; i--) {

			if(i == 0) break;
			
			top.push(i);
			
			if(arr[i-1] >= arr[i]) answer[i] = top.pop();
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(answer[i]+" ");
		}
		
	}
}
