package codeup.greedy;

import java.util.Scanner;

public class No3120_RemoteController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt(); 
		int b = sc.nextInt();

		int sum = 0;
		int cnt = 0;
		
		if(a > b) sum = a-b;
		else if(b > a) sum = b-a;
		
		while(sum != 0) {
			
			if(sum >= 10 || (sum < 10 && sum > 7)) sum -= 10;
			else if(sum >= 3 && sum <= 7) sum -= 5;
			else if(sum < 3 && sum > 0) sum -= 1;
			
			if(sum < 0) sum = Math.abs(sum); //무한반복 탈출! (-로 넘어가는 예외 막아줌)
			cnt++;
		}
		
		System.out.println(cnt);
	}
}
