package codeup.dynamic_planning;

import java.util.Scanner;

public class No2601_FibonacciSequence {

	private static Scanner sc = new Scanner(System.in);
	
	public static int fibonacciSequence(int n) {
		
		if(n == 1) return 1;
		if(n == 2) return 1;
		else return fibonacciSequence(n-1) + fibonacciSequence(n-2);
	}
	
	public static void main(String[] args) {

		int n = sc.nextInt();
		int sum = fibonacciSequence(n);
		
		System.out.println(sum);
		
	}
}
