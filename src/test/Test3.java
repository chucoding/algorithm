package test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static String[] solution(String[] teamIDs, String[] additional) {
		String[] answer = {};
		List<String> list = new ArrayList();

		for(String add : additional) {
			for(String teamID : teamIDs) {
				if(teamID.equals(add)) continue;
			}

			list.add(add);
		}

		answer = new String[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
			System.out.println(answer[i]);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		String[] teamIDs = {"world", "prog"};
		String[] additional = {"hello","world","code", "hello", "try", "code"};
		
		String[] answer = solution(teamIDs, additional);
	}
}
