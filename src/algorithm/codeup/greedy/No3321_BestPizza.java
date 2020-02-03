package algorithm.codeup.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class No3321_BestPizza {

	public static void main(String[] args) {

		int n = 0; //토핑 종류 수
		int a = 0; //도우의 가격
		int b = 0; //토핑의 가격
		int c = 0; //도우의 칼로리를 나타내는 정수
		Integer d[] = null; //토핑 종류당 칼로리를 나타내는 배열
		
		double bestPizza = 0.0; // 최적해
		
		Scanner sc = new Scanner(System.in);

		System.out.print("토핑 종류 수를 입력하시오 : ");
		while(true) {
			n = sc.nextInt();
			if(n>= 1 && n<= 100) break;
			
			System.out.print("입력할 수 없는 숫자입니다. 1부터 100사이의 값을 입력하시오 : ");
		}

		System.out.print("도우의 가격 및 토핑의 가격을 입력하시오(공백으로 구분) : ");
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			if((a>= 1 && a<= 1000) && (b>= 1 && b<= 1000)) break;
			
			System.out.print("입력할 수 없는 숫자입니다. 1부터 1000사이의 값을 입력하시오 : ");
		}
		
		System.out.print("도우의 칼로리를 입력하시오 : ");
		while(true) {
			c = sc.nextInt();
			if(c >=1 && c<= 10000) break;
			
			System.out.print("입력할 수 없는 숫자입니다. 1부터 10000사이의 값을 입력하시오 : ");
		}
		
		d = new Integer[n];
		for(int i=0; i<n; i++) {
			System.out.print((i+1)+"번째 토핑의 칼로리를 입력하시오 : ");
			while(true) {
				d[i] = sc.nextInt();
				if(d[i]>=1 && d[i]<=10000) break;
				System.out.println("입력할 수 없는 숫자입니다. 1부터 10000사이의 값을 입력하시오 : ");
			}
		}
		
		Arrays.sort(d, Collections.reverseOrder());
		
		for(int i=0; i<d.length; i++) {
			System.out.print(d[i]+" ");
		}
		
		for(int i=0; i<=d.length; i++) {

			int sumKal = 0;
			double pizza = 0.0;
			
			if(i != 0) {
				for(int j=0; j<i; j++) {
					sumKal += d[j];
				}
			}
			
			pizza = (c + sumKal) / ( a + (i*b));
			if(bestPizza < pizza) bestPizza = pizza;
		}
		
		System.out.println(bestPizza);
	}
}
