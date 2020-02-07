package programmers.skill_test;

public class Level2_1 {

	public static long solution(int w,int h) {
		long answer = 1;
		int tmp = 0;
		
		int _h = h;
		int _w = w;
		
		//최대공약수 풀기
		while(_w !=0 ) {
			if(_w < _h) {
				tmp = _w;
				_w = _h;
				_h = tmp;
			}
			_w = _w-_h;
		}
		
		int a = h / _h;
		int b = w / _h;
		
		int solv = a + b - 1;

		answer = w * h - (solv * _h);
		
		return answer;
	}
	
	public static void main(String[] args) {
		long a = solution(8, 12);
		System.out.println(a);
	}
}
