package codeup.dynamic_planning;

import java.util.Scanner;
import java.util.Stack;

public class No2698_LongestPathHanoiTower {

	private static Scanner sc = new Scanner(System.in);
	
	private static Stack a = new Stack();
	private static Stack b = new Stack();
	private static Stack c = new Stack();
	
	public static void hanoiA(int a) {
	}
	
	public static void hanoiB() {
		
	}

	public static void hanoiC() {
		
	}
	
	public static void main(String[] args) {
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			a.push(i);
		}
		
		hanoiA((int)a.pop());
		System.out.println(a);
	}
}
