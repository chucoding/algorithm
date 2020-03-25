package codeup.dynamic_planning;

import java.util.Scanner;

public class KsquaredOfN {

	private static Scanner sc = new Scanner(System.in);
	// private static int n = 0;
	
	/*
	public static void main(String[] args) {
		n = sc.nextInt();
		int k = sc.nextInt();
		long sq=1;
		
		System.out.println(power(k, sq));
	}
	
	public static long power(int k, long sq) {
		
		if(k == 0) return sq %= 1000000007;
		if(sq >= 1000000007) sq %= 1000000007;
		else sq *= n;
		
		return power(k-1, sq);
	}
	*/
	
	//재귀돌리는 방법
//	public static void main(String[] args) {
//		long a=sc.nextInt();
//		long b=sc.nextInt();
//		long r=power(a,1,b);
//		
//		System.out.println(r);
//	}
//	public static long power(long a, long b, long c) {
//		
//		if(c == 0) return b;
//		else b= a*b%1000000007;
//		System.out.println(b);
//		return power(a,b, c-1);
//	}
	
	public static void main(String[] args) {
		long a=sc.nextInt();
		String b =Integer.toBinaryString(sc.nextInt());
		int c=b.length();
		long result = 1;
		
		long sub;
		for(int i=c-1;i>=0;i--) {
			if(b.charAt(i)=='1') {	//자릿수가 1이면 계산
				
				sub=(long) Math.pow(a,Math.pow(2, i));
				result=((result%1000000007)*(sub%1000000007))%1000000007;
				System.out.println(i);
				System.out.println(sub);
			}
			
		}

		System.out.println(result);
	}
	
}
