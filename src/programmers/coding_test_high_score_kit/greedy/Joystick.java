package programmers.coding_test_high_score_kit.greedy;

public class Joystick {

	public static int solution(String name) {
		int answer = 0;
		
		int[] left = new int[name.length()];
		int[] right = new int[name.length()];
		
		//처음에도 고려해줘야됨(무조건 위로만 간다는 생각 X) - 처음일때는 무조건 수행이니 아래 for문과 구분해줌
		if((name.charAt(0) - 65) <= (91 - name.charAt(0))) {
			left[0] = name.charAt(0) - 65;
			right[0] = name.charAt(0) - 65;
		} else {
			left[0] = 91 - name.charAt(0);
			right[0] = name.charAt(0) - 65;
		}
		
		for(int i=1; i<name.length(); i++) {
			if((name.charAt(i) - 65) <= (91 - name.charAt(i))) left[i] = name.charAt(i) - 65;
			else left[i] = 91 - name.charAt(i);
			
			if((name.charAt(name.length()-i) - 65) <= (91 - name.charAt(name.length()-i))) right[i] = name.charAt(name.length()-i) - 65;
			else right[i] = 91 - name.charAt(name.length()-i);
		}

		int l_cnt = 0;
		int r_cnt = 0;
		
		for(int i=left.length-1; i>=0; i--) {
			if(left[i] == 0) l_cnt++;
			else break;
		}
		
		for(int i=right.length-1; i>=0; i--) {
			if(right[i] == 0) r_cnt++;
			else break;
		}

		int zero_cnt = 0;
		int[] arr = new int[name.length()];

		if(l_cnt >= r_cnt) {
			zero_cnt = l_cnt;
			arr = left;
		}
		else {
			zero_cnt = r_cnt;
			arr = right;
		}
		
		int cnt = 0;
		for(int i=0; i<arr.length-zero_cnt; i++) {
			if(i==0) cnt += arr[i];
			else cnt+=arr[i]+1;
		}
		
		System.out.println(cnt);
		
		return answer;
	}
	
	public static void main(String[] args) {
		int sol = solution("JAZ");
		int sol2 = solution("JEROEN");
		int sol3 = solution("JAN");
		int sol4 = solution("ZZZ");
		int sol5 = solution("ZAZ");
	}
}
