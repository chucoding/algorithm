package codeup.recursive_function;

import java.util.Scanner;

public class No1915_FibonacciSequence {

	private static Scanner sc = new Scanner(System.in);
	
	public static int fibonacciSequence(int n) {
		
		if(n <= 2) return 1;
		return fibonacciSequence(n-1) + fibonacciSequence(n-2);
		
	}
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		System.out.println(fibonacciSequence(n));
	}
}
