package codeup.recursive_function;

import java.util.Scanner;

public class No1916_FibonacciSequenceLarge {

	private static Scanner sc = new Scanner(System.in);
	
	public static int fibonacciSequence(int a, int b, int n) {
		
		if(n == a) return a;
		if(n == b) return b;
		
		return fibonacciSequence(a,b,n-1) + fibonacciSequence(a,b,n-2);
		
	}
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int i = 1;
		int b = 1;
		int tot = 0;
		
		tot = fibonacciSequence(i,b,n);
	}
}
