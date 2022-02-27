package codeup.greedy;

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
		
		double _bestPizza = 0.0; // 최적해
		int bestPizza = 0; //최적해를 정수로
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			n = sc.nextInt();
			if(n>= 1 && n<= 100) break;
		}

		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			if((a>= 1 && a<= 1000) && (b>= 1 && b<= 1000)) break;
		}
		
		while(true) {
			c = sc.nextInt();
			if(c >=1 && c<= 10000) break;
		}
		
		d = new Integer[n];
		for(int i=0; i<n; i++) {
			while(true) {
				d[i] = sc.nextInt();
				if(d[i]>=1 && d[i]<=10000) break;
			}
		}
		
		Arrays.sort(d, Collections.reverseOrder());
		
		_bestPizza = c / a;
		for(int i=1; i<=d.length; i++) {

			int sumKal = 0;
			double pizza = 0.0;
			
			for(int j=0; j<i; j++) {
				sumKal += d[j];
			}
			
			pizza = (c + sumKal) / ( a + (i*b));
			if(_bestPizza < pizza) _bestPizza = pizza;
		}
		
		bestPizza = (int)Math.floor(_bestPizza);
		System.out.println(bestPizza);
	}
}
