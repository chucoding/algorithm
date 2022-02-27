package codeup.recursive_function;

import java.util.Scanner;

public class No1928_3n1 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void function(int n) {
		
		if(n == 1) return;
		else if(n%2==1) n = 3*n + 1;
		else n /=2;
		
		System.out.println(n);
		function(n);
	}
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		System.out.println(n);
		function(n);
	}
}
