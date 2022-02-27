package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

class Home {
	
	private int i;
	private int j;
	private int val;
	
	public Home(int i, int j, int val) {
		this.i = i;
		this.j = j;
		this.val = val;
	}
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	
	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

}

public class RgbDistance {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int answer = 0;
		
		List<Home> list = new ArrayList<Home>();
		int[][] disable = new int[n][3];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<3; j++) {
				Home h = new Home(i, j, Integer.parseInt(st.nextToken()));
				list.add(h);
			}
		}
		
		Collections.sort(list, new Comparator<Home>(){

			@Override
			public int compare(Home o1, Home o2) {
				// TODO Auto-generated method stub
				return o1.getVal() - o2.getVal();
			}
		});
		
		for(int k=0; k<list.size(); k++) {
			
			int i = list.get(k).getI();
			int j = list.get(k).getJ();

			if(disable[i][j] == 1) continue;

			answer += list.get(k).getVal();
			
			disable[i][0] = 1;
			disable[i][1] = 1;
			disable[i][2] = 1;
			
			if(i > 0) {
				disable[i-1][j] = 1;
			}
			
			if(i < n-1) {
				disable[i+1][j] = 1;
			}
		}
		
		System.out.println(answer);
	}
}
