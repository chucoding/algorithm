package codeup.recursive_function;

import java.util.Scanner;

public class No1912_Factorial {

	private static Scanner sc = new Scanner(System.in);
	
	public static int factorial(int n){
		
		if(n == 1) return 1;
		return n * factorial(n-1);
	}
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int f = factorial(n);
	
		System.out.println(f);
	}
}
